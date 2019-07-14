package com.stakeroute.domain;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

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
    public Actor actor1() {
        Actor actor = new Actor("shibani","female" ,19);

        return actor;

    }

    @Bean
    public Actor actor2() {
        Actor actor = new Actor("tushar", "male", 17);

        return actor;
    }

    public Actor actor3() {
        Actor actor = new Actor("yogi","male" ,15);

        return actor;



    }


    @Bean({"movieA","movieB"})
    @Scope("prototype")
    public Movie movie()
    {
        Movie movie = new Movie(actor());
        return movie;


    }
}

