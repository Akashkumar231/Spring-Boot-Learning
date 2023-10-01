package com.akash.springcoredemo.config;

import com.akash.springcoredemo.common.Coach;
import com.akash.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("bean")
    public Coach swimCoach(){

        return new SwimCoach();

    }

}
