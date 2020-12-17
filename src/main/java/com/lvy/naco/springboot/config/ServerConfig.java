package com.lvy.naco.springboot.config;


import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "springboot")
public class ServerConfig {

    private String serverName;

    private String type;
}
