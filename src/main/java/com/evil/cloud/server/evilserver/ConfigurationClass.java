package com.evil.cloud.server.evilserver;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
@EnableWebMvc
@EnableAutoConfiguration
public class ConfigurationClass extends WebMvcConfigurerAdapter {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/img/**", "/css/**", "/js/**","/templates/**").addResourceLocations(
				 "classpath:/static/img/", "classpath:/static/css/",
				"classpath:/static/js/","classpath:/templates/");
	}

}
