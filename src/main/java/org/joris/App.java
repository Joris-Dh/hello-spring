package org.joris;
import java.util.Properties;

public class App {
    public static void main(String[] args) {
        Properties properties = SpringService.loadProperties();
        SpringService service = new SpringService(properties);
        service.print();
    }
}
