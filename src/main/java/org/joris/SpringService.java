package org.joris;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SpringService {

    public void print(){
        Properties p = new Properties();

        // Load properties file from the classpath
        try (
                InputStream is = App.class.getClassLoader().getResourceAsStream("application.properties")) {
            p.load(is);

            if (p.getProperty("configured_language").equals("NL")) {
                System.out.println(p.getProperty("NL_hello_world"));

            } else if (p.getProperty("configured_language").equals("FR")){
                System.out.println(p.getProperty("FR_hello_world"));

            } else if (p.getProperty("configured_language").equals("GER")) {
                System.out.println(p.getProperty("GER_hello_world"));

            } else {
                System.out.println("native_hello_world");
            }

        } catch (
                IOException e) {
            System.err.println("Error loading properties file: " + e.getMessage());
        }
    }
}
