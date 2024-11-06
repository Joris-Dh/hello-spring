package org.joris;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        // Load the Spring context from the Java configuration class
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringService.class);

        // Retrieve the SpringService bean
        SpringService hello = context.getBean(SpringService.class);

        // Call the method on the SpringService bean
        hello.print();
    }
}
