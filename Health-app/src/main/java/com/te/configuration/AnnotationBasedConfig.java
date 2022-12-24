package com.te.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.te.")
@EnableWebMvc
public class AnnotationBasedConfig {
@Bean
public InternalResourceViewResolver getresolver() {
	InternalResourceViewResolver ir = new InternalResourceViewResolver();
	ir.setPrefix("/WEB-INF/views/");
	ir.setSuffix(".jsp");
	return ir;
}
}
