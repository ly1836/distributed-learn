package com.sz.earlysummer.smsbombing.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description
 * @auther leiyang
 * @create 2019-04-09 20:35
 */
@RestController
@Log4j2
public class loginController {

    @GetMapping(value = "register/send-code")
    public String login(HttpServletRequest request, Object object) {
        log.info("requestURL:[{}],ts:[{}]", request.getRequestURL(), System.currentTimeMillis());
        return "Java project CI/CD Kubernetes.----TEST[9] - 2020-07-22 10:05";
    }
}
