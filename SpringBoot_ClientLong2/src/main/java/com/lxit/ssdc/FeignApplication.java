package com.lxit.ssdc;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@EnableAutoConfiguration
public class FeignApplication {

		
	public static void main(String[] args) {
		new SpringApplicationBuilder(FeignApplication.class).web(true).run(args);
	}
}