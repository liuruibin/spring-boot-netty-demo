package com.fit2cloud.netty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("file:/Users/liuruibin/Dropbox/IDEA/conf/application.properties")
public class NettyDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(NettyDemoApplication.class, args);
    }
}
