package com.sz.earlysummer.smsbombing.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@Slf4j
public class HealthzController {
    /**
     * 健康检查 服务的响应状态
     */
    @GetMapping({"/healthz"})
    public String healthz() {
        log.info("/healthz==>ts:{}",System.currentTimeMillis());
        return "I'm fine!";
    }
}
