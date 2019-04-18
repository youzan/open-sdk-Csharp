package com.youzan.open.gen.config;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.thread.QueuedThreadPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.boot.context.embedded.jetty.JettyEmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.jetty.JettyServerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.servlet.DispatcherType;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author ph0ly
 * @time 2016-10-10
 */
@Configuration
public class ApplicationConfiguration extends WebMvcConfigurerAdapter {

    @Bean
    public EmbeddedServletContainerCustomizer customizer(@Value("${server.jetty.basedir}") final String docBase,
                                                         @Value("${server.jetty.threadPool.maxThreads:200}") final String maxThreads,
                                                         @Value("${server.jetty.threadPool.minThreads:8}") final String minThreads,
                                                         @Value("${server.jetty.threadPool.idleTimeout:60000}") final String idleTimeout) {
        return new EmbeddedServletContainerCustomizer() {

            @Override
            public void customize(ConfigurableEmbeddedServletContainer container) {
                if (container instanceof JettyEmbeddedServletContainerFactory) {
                    customizeJetty((JettyEmbeddedServletContainerFactory) container);
                }
            }

            private void customizeJetty(JettyEmbeddedServletContainerFactory jetty) {
                jetty.setDocumentRoot(new File(docBase));
                jetty.addServerCustomizers(new JettyServerCustomizer() {
                    @Override
                    public void customize(Server server) {
                        final QueuedThreadPool threadPool = server.getBean(QueuedThreadPool.class);
                        threadPool.setMaxThreads(Integer.valueOf(maxThreads));
                        threadPool.setMinThreads(Integer.valueOf(minThreads));
                        threadPool.setIdleTimeout(Integer.valueOf(idleTimeout));
                    }
                });
            }
        };

    }

}
