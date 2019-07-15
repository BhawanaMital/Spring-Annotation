package com.stakeroute;


import com.stakeroute.domain.Config;
import com.stakeroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context=new AnnotationConfigApplicationContext(Config.class);

        Movie movie=context.getBean("movieA",Movie.class);
        System.out.println(movie);


        Movie movie1=context.getBean("movieA", Movie.class);
        Movie movie2=context.getBean("movieB", Movie.class);

        System.out.println(movie1==movie2);
    }

}