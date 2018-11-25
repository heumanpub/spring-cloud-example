package com.heuman.eureka.server;

import com.heuman.eureka.server.common.utils.NetworkUtil;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    public static void main(String[] args) {
        if (NetworkUtil.isUsed("localhost", 8761)) {
            System.setProperty("spring.profiles.active", "8762");
        } else {
            System.setProperty("spring.profiles.active", "8761");
        }
        LoggerFactory.getLogger(EurekaServerApplication.class).info("spring.profiles.active: {}", System.getProperty("spring.profiles.active"));
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
