package com.example.config_service_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class ConfigServiceDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServiceDemoApplication.class, args);
    }

}
