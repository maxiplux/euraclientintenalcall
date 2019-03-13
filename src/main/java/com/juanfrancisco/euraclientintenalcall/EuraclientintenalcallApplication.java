package com.juanfrancisco.euraclientintenalcall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EuraclientintenalcallApplication {

    public static void main(String[] args) {
        SpringApplication.run(EuraclientintenalcallApplication.class, args);
    }

}
