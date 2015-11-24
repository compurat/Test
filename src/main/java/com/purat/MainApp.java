package com.purat;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by compurat on 11/24/15.
 */
public class MainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");

        // Let us raise a start event.
        context.start();

/*
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

        obj.getMessage();
*/


    }
}
