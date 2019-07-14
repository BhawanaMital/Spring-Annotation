package com.stakeroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public  class Movie {

    private Actor actor;

    public Movie() {
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Movie(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }

}
