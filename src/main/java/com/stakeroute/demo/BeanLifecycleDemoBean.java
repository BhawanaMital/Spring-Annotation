package com.stakeroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean after set property is created.......");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean is destroyed........");
    }

    @PostConstruct
    public void customInit(){
        System.out.println("Custom init method......");
    }

    @PreDestroy
    public void Destroy(){
        System.out.println("Destroy method....");
    }
}
