package com.laalka.analizatorconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class AnalizatorConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnalizatorConfigServerApplication.class, args);
    }

}
