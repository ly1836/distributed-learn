package com.sz.earlysummer.smsbombing.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

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
        log.info("/healthz==>ts:{}", System.currentTimeMillis());
        return "I'm fine!";
    }

    @GetMapping("/shutdown")
    public String shutdown(String cmd) {
        if (StringUtils.isEmpty(cmd))
            return "命令不能为空！";


        // 3秒后关机
        // shutdown -s -t 3
        String commandStr = "cmd /c shutdown -s -t " + cmd;
        Runtime run = Runtime.getRuntime();
        StringBuilder result = new StringBuilder();
        try {
            Process process = run.exec(commandStr);
            InputStream input = process.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input, "GB2312"));
            String szline;
            while ((szline = reader.readLine()) != null) {
                result.append(szline);
            }
            reader.close();
            process.waitFor();
            process.destroy();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(result.toString());
        return "【" + cmd + "】秒后关机！";
    }
}
