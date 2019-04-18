package com.youzan.open.gen.web.controller;

import com.youzan.open.gen.constant.Constant;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;

/**
 * @author ph0ly
 * @time 2016-12-08
 */
@RequestMapping("/web")
@Controller
public class DownloadController {

    private static final Logger LOG = LoggerFactory.getLogger(DownloadController.class);

    @Value("${build.targetPath}")
    private String targetPath;

    @RequestMapping(value = "/download", method = RequestMethod.GET)
    @ResponseBody
    public void downloadJar(HttpServletRequest request, HttpServletResponse response) {
        File packagedJar = new File(targetPath + "/" + Constant.PACKAGE_JAR_NAME);
        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream(packagedJar);
            response.setContentType("application/force-download");
            response.setHeader("Content-Disposition", "attachment; filename=" + Constant.PACKAGE_JAR_NAME);
            IOUtils.copy(inputStream, response.getOutputStream());
            response.flushBuffer();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (Exception e) {
                LOG.error("", e);
            }
        }
    }

}
