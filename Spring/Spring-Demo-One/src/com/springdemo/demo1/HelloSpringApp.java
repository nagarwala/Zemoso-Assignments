package com.springdemo.demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //Retrieve bean from container
        Coach theTrackCoach = context.getBean("myTrackCoach", Coach.class);
        Coach theBaseballCoach = context.getBean("myBaseballCoach", Coach.class);

        System.out.println(theBaseballCoach.getDailyWorkout());

        //new method call which has been injected
        System.out.println(theBaseballCoach.getDailyFortune());

        context.close();

    }
}
