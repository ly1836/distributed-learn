package com.sz.earlysummer.smsbombing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class HealthzController {
    /**
     * 健康检查 服务的响应状态
     */
    @GetMapping({"/healthz"})
    public String healthz() {
        return "I'm fine!";
    }
}
