package com.sachin.eureka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {


    @RequestMapping("/")
    public String index() {
        return "";

    }
    @RequestMapping("/")
    public String inde2x() {
        return "";

    }
}
