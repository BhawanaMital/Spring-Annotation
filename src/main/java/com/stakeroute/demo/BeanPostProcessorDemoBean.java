package com.stakeroute.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

public class BeanPostProcessorDemoBean implements BeanPostProcessor {


    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Post Process Before Initialisation ....."+beanName);
        return bean;
    }


    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Post Process After Initilisation......"+beanName);
        return bean;
    }
}
