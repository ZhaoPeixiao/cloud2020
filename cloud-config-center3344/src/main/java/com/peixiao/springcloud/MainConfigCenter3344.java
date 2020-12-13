package com.peixiao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Peixiao Zhao
 * @date 2020/12/13 8:15
 */
@SpringBootApplication
@EnableConfigServer
public class MainConfigCenter3344 {

    public static void main(String[] args) {
        SpringApplication.run(MainConfigCenter3344.class, args);
    }
}
