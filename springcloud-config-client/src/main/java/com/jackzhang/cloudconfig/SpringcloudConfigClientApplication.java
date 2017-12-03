package com.jackzhang.cloudconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringcloudConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudConfigClientApplication.class, args);
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
