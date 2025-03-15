package com.dev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext c =
                new AnnotationConfigApplicationContext(BeanConfig.class);
        Bmw mb = c.getBean("bmw", Bmw.class);
        System.out.println(mb.getSpeed());
        System.out.println(mb.getCapacity());
        System.out.println(mb.getCode());
    }
}
