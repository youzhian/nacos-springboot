package com.lvy.naco.springboot.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.lvy.naco.springboot.config.ServerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.Properties;

@RestController
@RequestMapping("/hellonacos")
public class HelloNacosController {

    @Autowired
    private ServerConfig serverConfig;
    @NacosValue("")
    private String name;

    @GetMapping("hiNacos")
    public Object hiNacos(){
        String serverName = serverConfig.getServerName();
        Properties ps = System.getProperties();
        Properties ps2 = new Properties();
        try {
            ps2 = PropertiesLoaderUtils.loadAllProperties("application-dev.yml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "hi the serverName from nacos this value is "+serverName;
    }
}
