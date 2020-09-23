package com.sachin.eureka;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author Sachin
 * @Date 2020/9/19
 **/
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

    public static void main(String[] args) {

        Class class29=EurekaServerApplication.class;
        new SpringApplicationBuilder(class29).
                web(WebApplicationType.SERVLET).run(args);
        System.out.println(class29.getClass());

        String head="git checkout head";
    }

}
