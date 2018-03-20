package com.bidostar.study.fangming.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author fangming
 */
@SpringBootApplication
@EnableEurekaServer
@EnableAutoConfiguration
public class EurekaServerHaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerHaApplication.class, args);
	}
}
