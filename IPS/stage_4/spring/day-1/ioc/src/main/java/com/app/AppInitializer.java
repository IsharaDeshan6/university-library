package com.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppInitializer
{
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("ApplicationContext.xml");
       FullStackCourse c1 = context.getBean("fullstack", FullStackCourse.class);
       FullStackCourse c2 = context.getBean("fullstack", FullStackCourse.class);

        System.out.println(c1 == c2);
        System.out.println(c1);
        System.out.println(c2);
        context.close();
//         System.out.println(fs.getProgrammeName());
//         //=============================DI==========================================
//         System.out.println(fs.getPrice());
//         System.out.println(fs.getDuration());

    }
}
