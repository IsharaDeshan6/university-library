package com.app;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppInitializer
{
    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext
                = new ClassPathXmlApplicationContext("ApplicationContext.xml");
     Course fullStackCourse =   classPathXmlApplicationContext.getBean("FullStackCourse",Course.class);
        System.out.println(fullStackCourse.getProgrammeName());
        System.out.println(fullStackCourse.calculateCost());

        classPathXmlApplicationContext.close();
    }
}
