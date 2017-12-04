package com.jackzhang.cloudconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@RefreshScope
public class SpringcloudConfigClientDisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudConfigClientDisApplication.class, args);
	}

	/**
	 * 会根据spring.application.name和相应profile找到对应properties文件中的配置
	 */
	@Value("${author}")
	String author;

	@RequestMapping(value = "/name")
	public String name(){
		return author;
	}
}
