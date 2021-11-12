package com.ana.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class eurekaMain {

    public static void main(String[] args) {
        SpringApplication.run(eurekaMain.class,args);
    }

}
