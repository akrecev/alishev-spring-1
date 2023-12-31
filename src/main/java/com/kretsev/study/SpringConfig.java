package com.kretsev.study;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.kretsev.study")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}

