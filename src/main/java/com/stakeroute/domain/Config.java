package com.stakeroute.domain;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Actor actor() {
        Actor actor = new Actor();
        actor.setAge(21);
        actor.setGender("female");
        actor.setName("BHawana");
        return actor;

    }

    @Bean
    public Movie movie()
    {
        Movie movie = new Movie(actor());
        return movie;


    }
}

