package com.zm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ZhangmenEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhangmenEurekaApplication.class, args);
    }

}
