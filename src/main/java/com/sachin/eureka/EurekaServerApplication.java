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

        Class class2=EurekaServerApplication.class;
        new SpringApplicationBuilder(class2).
                web(WebApplicationType.SERVLET).run(args);
    }

}
