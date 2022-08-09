package com.company.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.company.springdemo")
@PropertySource("classpath:sport.properties")
public class sportsConfig {

    @Bean
    public  FortuneService sadFortuneService(){
        return new sadFortuneService();
    }
    @Bean
    public Coach swimCoach(){
        return new swimCoach(sadFortuneService());
    }
}
