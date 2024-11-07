package org.joris;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SpringService {

    private Properties properties;

    // Constructor for dependency injection, makes testing easier
    public SpringService(Properties properties) {
        this.properties = properties;
    }

    // Separate method to load properties from file, allowing it to be mocked in tests
    public static Properties loadProperties() {
        Properties p = new Properties();
        try (InputStream is = SpringService.class.getClassLoader().getResourceAsStream("application.properties")) {
            if (is != null) {
                p.load(is);
            } else {
                System.err.println("Properties file not found.");
            }
        } catch (IOException e) {
            System.err.println("Error loading properties file: " + e.getMessage());
        }
        return p;
    }

    public void print() {
        String language = properties.getProperty("configured_language");

        switch (language) {
            case "NL":
                System.out.println(properties.getProperty("NL_hello_world"));
                break;
            case "FR":
                System.out.println(properties.getProperty("FR_hello_world"));
                break;
            case "GER":
                System.out.println(properties.getProperty("GER_hello_world"));
                break;
            default:
                System.out.println("native_hello_world");
                break;
        }
    }
}
