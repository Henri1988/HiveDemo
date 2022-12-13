package com.example.hivedemo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationConfigs {

    @Bean
    @ConfigurationProperties(prefix = "hive")
    public HiveProperties hiveProperties(){
        return new HiveProperties();
    }

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
