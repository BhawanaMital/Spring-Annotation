package com.stakeroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public  class Movie {

    @Autowired
    private Actor actor;

    public Movie() {
    }


    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }

}
