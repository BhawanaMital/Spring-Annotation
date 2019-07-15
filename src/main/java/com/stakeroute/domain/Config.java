package com.stakeroute.domain;


import com.stakeroute.demo.BeanLifecycleDemoBean;
import com.stakeroute.demo.BeanPostProcessorDemoBean;
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

    @Bean
    public BeanLifecycleDemoBean beanLifecycleDemoBean(){
        return new BeanLifecycleDemoBean();
    }

    @Bean
    public BeanPostProcessorDemoBean beanPostProcessorDemoBean(){
        return new BeanPostProcessorDemoBean();
    }
}

