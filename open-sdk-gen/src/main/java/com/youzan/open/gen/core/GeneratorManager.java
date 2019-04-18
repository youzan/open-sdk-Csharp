package com.youzan.open.gen.core;

import com.google.common.base.*;
import com.google.common.collect.*;
import com.youzan.open.gen.constant.Constant;
import com.youzan.open.gen.core.converter.TypeConverter;
import com.youzan.open.gen.core.gens.APIGenerator;
import com.youzan.open.gen.core.gens.APIParamGenerator;
import com.youzan.open.gen.core.gens.APIResultGenerator;
import com.youzan.open.gen.core.gens.GeneratorContext;
import com.youzan.open.gen.core.meta.MetaCenter;
import com.youzan.open.gen.model.OpenAPI;
import com.youzan.open.gen.web.service.CarmenAPIService;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.*;
import java.util.*;

/**
 * @author ph0ly
 * @time 2016-11-30
 */
@Component
public class GeneratorManager {

    private static final Logger LOG = LoggerFactory.getLogger(GeneratorManager.class);

    @Autowired
    private CarmenAPIService apiService;

    @Value("${build.genPath}")
    private String genPath;

    @Value("${build.rootPath}")
    private String rootPath;

    @Value("${build.targetPath}")
    private String targetPath;

    @Autowired
    private MetaCenter metaCenter;

    @Autowired
    private TypeConverter typeConverter;

    @Autowired
    private APIGenerator apiGenerator;

    @Autowired
    private APIParamGenerator apiParamGenerator;

    @Autowired
    private APIResultGenerator apiResultGenerator;

    private List<Generator> generators = Lists.newArrayList();

    @PostConstruct
    public void init() {
        generators.add(apiGenerator);

        generators.add(apiParamGenerator);

        generators.add(apiResultGenerator);
    }

    public void execute() {
        Multimap<String, OpenAPI> openAPIs = apiService.getOpenAPIs();

        String basePackage = "com.youzan.open.sdk";

        for (String version : openAPIs.keySet()) {
            Collection<OpenAPI> versionAPIs = openAPIs.get(version);

            for (OpenAPI openAPI : versionAPIs) {
                String className = openAPI.getName().toLowerCase().replace(".", "_");
                className = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, className);

                String paramClassName = className + "Params";
                String resultClassName = className + "Result";
                String baseVersionPackageName = basePackage + ".gen.v" + version.replace(".", "_");

                GeneratorContext context = new GeneratorContext();
                context.setOpenAPI(openAPI);
                context.setBaseVersionPackageName(baseVersionPackageName);
                context.setClassName(className);
                context.setParamClassName(paramClassName);
                context.setResultClassName(resultClassName);
                context.setTypeConverter(typeConverter);
                context.setMetaCenter(metaCenter);
                context.setGenPath(genPath + "/v" + openAPI.getVersion().replace(".", "_"));

                for (Generator generator : generators) {
                    generator.generate(context);
                }
            }
        }

        // 执行编译并打包
        doPackage();

    }

    private void doPackage() {
        LOG.info("Begin packaging, source({}), target({}), package({})", rootPath, targetPath, Constant.PACKAGE_JAR_NAME);
        ProcessBuilder pb = new ProcessBuilder("/bin/bash");
        pb.redirectErrorStream(true);
        Process proc = null;
        BufferedReader reader = null;
        PrintWriter writer = null;
        try {
            proc = pb.start();

            reader = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(proc.getOutputStream())), true);

            List<String> bashLines = Lists.newArrayList();
            bashLines.add("cd " + rootPath);
            bashLines.add("mvn clean package -DskipTests=true");
            bashLines.add("cd target");
            bashLines.add("scp " + Constant.PACKAGE_JAR_NAME + " " + targetPath);
            bashLines.add("exit");

            LOG.info("Shell({})", Joiner.on("\n").join(bashLines));

            for (String bashLine : bashLines) {
                writer.println(bashLine);
            }

            writer.println();

            LOG.info("{}", IOUtils.toString(reader));
            LOG.info("Finished packaging with exit code({})", proc.exitValue());

        } catch (Exception e) {
            LOG.error("", e);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (Exception e) {
                LOG.error("", e);
            }
            if (proc != null) {
                proc.destroy();
            }
        }
    }
}
