package com.ps.designpattern.java._01singleton.src.main.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringExample {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Sun sun1 = applicationContext.getBean("sun", Sun.class);
        Sun sun2 = applicationContext.getBean("sun", Sun.class);
        System.out.println(sun1 == sun2);
    }

}
