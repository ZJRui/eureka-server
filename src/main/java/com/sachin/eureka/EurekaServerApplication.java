package com.sachin.eureka;

import com.sachin.eureka.controller.IndexController;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private IndexController indexController;

    private SachinConfig sachinConfig;
    public static void main(String[] args) {

        WebApplicationType type = WebApplicationType.SERVLET;
        SpringApplicationBuilder builder=new SpringApplicationBuilder(EurekaServerApplication.class);

        SpringApplicationBuilder web = builder.web(type);
        web.run(args);
        String student ;

        String modify2;
        String message="现在处于分离头指针状态";


    }

}
