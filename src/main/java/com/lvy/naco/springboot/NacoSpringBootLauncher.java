package com.lvy.naco.springboot;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 项目启动类
 * @author youzhian
 */
@SpringBootApplication
//@NacosPropertySource(dataId = "example",autoRefreshed = true)
public class NacoSpringBootLauncher {

    public static void main(String []args){
        SpringApplication.run(NacoSpringBootLauncher.class,args);
    }
}
