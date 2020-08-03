package com.sz.earlysummer.smsbombing.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "pepole")
public class TestAutoConfigs {

    private String name;
}
