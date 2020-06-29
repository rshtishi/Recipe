package com.github.rshtishi.recipe.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.github.rshtishi.recipe.interceptors.LoggerInterceptor;

@Configuration
public class InterceptorConfiguration implements WebMvcConfigurer {
	
	@Bean
	public LoggerInterceptor loggerInterceptor() {
		return new LoggerInterceptor();
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(loggerInterceptor());
	}
	
}
