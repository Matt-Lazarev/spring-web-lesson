package com.lazarev.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration //@Component --> Bean -> Context
@ComponentScan("com.lazarev.web")
public class AppConfig { }
