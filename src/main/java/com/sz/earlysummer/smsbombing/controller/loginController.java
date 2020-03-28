package com.sz.earlysummer.smsbombing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @auther leiyang
 * @create 2019-04-09 20:35
 */
@RestController
public class loginController {

    @GetMapping(value = "register/send-code")
    public String login(Object object){
        return "Java project CI/CD Kubernetes.----TEST[1]";
    }
}
