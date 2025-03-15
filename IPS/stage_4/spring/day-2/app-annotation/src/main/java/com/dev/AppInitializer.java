package com.dev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppInitializer {


    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");

       Vehicle bmwI = context.getBean("bmw",Vehicle.class);
       Vehicle bmw5 = context.getBean("bmw",Vehicle.class);
        System.out.println(bmw5==bmwI);


    }
}
