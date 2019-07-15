package com.stakeroute.domain;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:/values.properties")
public class Config {
    @Bean
    public Actor actor() {

        return  new Actor();

    }



    @Bean({"movieA","movieB"})
    @Scope("prototype")
    public Movie movie()
    {
        Movie movie = new Movie();
        return movie;


    }
}

