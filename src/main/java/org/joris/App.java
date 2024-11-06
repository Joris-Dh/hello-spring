package org.joris;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class App {
    public static void main(String[] args) {
        Properties p = new Properties();

        // Load properties file from the classpath
        try (InputStream is = App.class.getClassLoader().getResourceAsStream("application.properties")) {
            p.load(is);
            String message = p.getProperty("NL_hello_world");
            System.out.println(message);

        } catch (IOException e) {
            System.err.println("Error loading properties file: " + e.getMessage());
        }
    }
}
