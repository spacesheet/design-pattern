package com.ps.designpattern.java._01singleton.src.main.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public String sun() {
        return Sun.createSun(3.828E26, 46);
    }

}