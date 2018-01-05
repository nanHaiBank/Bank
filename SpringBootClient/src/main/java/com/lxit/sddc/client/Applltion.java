package com.lxit.sddc.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = { "com.lxit.sddc.client" })
@EnableDiscoveryClient
// 通过EnableFeignClients来获取FeignService的指定的参数
@EnableFeignClients
public class Applltion {

	public static void main(String[] args) {
		new SpringApplicationBuilder(Applltion.class).web(true).run(args);
	}
}