package com.example.application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Jin.D
 * @date: 2018年3月15日 下午12:29:20
 */
@SpringBootApplication
@ComponentScan("com.example.controller")
@MapperScan("com.example.mapper")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
