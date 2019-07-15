package com.stakeroute.domain;

import org.springframework.beans.factory.annotation.Value;

public class Actor {

    @Value("${actor.name}")
    private String name;

    @Value("${actor.gender}")
    private String gender;

    @Value("${actor.age}")
    private int age;

    public Actor() {
    }


    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}



