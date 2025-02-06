package com.laalka.analizatoreurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AnalizatorEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnalizatorEurekaServerApplication.class, args);
    }

}
