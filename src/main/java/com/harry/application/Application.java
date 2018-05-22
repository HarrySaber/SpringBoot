package com.harry.application;

import com.harry.utils.Interceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author Jin.D
 * @date: 2018年3月15日 下午12:29:20
 */
@SpringBootApplication
@EnableCaching
@ComponentScan("com.harry.controller")
@MapperScan("com.harry.mapper")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	static class WebMvcConfig extends WebMvcConfigurerAdapter{
		@Override
		public void addInterceptors(InterceptorRegistry registry) {
			registry.addInterceptor(new Interceptor());
			//super.addInterceptors(registry);
		}
	}
}
