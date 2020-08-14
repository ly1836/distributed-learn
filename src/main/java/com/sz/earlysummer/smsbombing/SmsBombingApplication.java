package com.sz.earlysummer.smsbombing;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SmsBombingApplication {

    public static void main(String[] args) {
        try {
            log.info("args:[{}]", JSONObject.toJSONString(args));
            final String active = System.getProperty("env", "dev").toLowerCase();
            log.info("active=[{}]", active);
            System.setProperty("spring.profiles.active", active);
            //System.setProperty("apollo.meta", "http://192.168.0.160:8181");
            SpringApplication.run(SmsBombingApplication.class, args);
        }catch (Exception ex){
            ex.printStackTrace();
            log.error("",ex);
        }
    }

}
