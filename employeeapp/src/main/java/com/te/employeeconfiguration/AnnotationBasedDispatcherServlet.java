package com.te.employeeconfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(" com.te")
@EnableWebMvc
public class AnnotationBasedDispatcherServlet {

}
