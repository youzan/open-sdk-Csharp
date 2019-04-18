package com.youzan.open.gen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author ph0ly
 * @time 2016-11-30
 */
@SpringBootApplication
@ImportResource("dubbo.xml")
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}
