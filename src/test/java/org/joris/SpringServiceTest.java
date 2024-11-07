package org.joris;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Properties;

//import static org.mockito.Mockito.*;

class SpringServiceTest {

    private Properties properties;
    private SpringService springService;

    @BeforeEach
    void setUp() {
        properties = new Properties();
        springService = new SpringService(properties);
    }

    @Test
    void testPrintForDutchLanguage() {
        properties.setProperty("configured_language", "NL");
        properties.setProperty("NL_hello_world", "Hallo Wereld");

        springService.print();  // Verify output manually or redirect System.out
        //    configured_language is set to "NL", which simulates a Dutch language configuration.
        //    NL_hello_world is set to "Hallo Wereld", the expected output in Dutch.
        //    springService.print() is then called. Based on the properties, the print() method should check configured_language, find it set to "NL", and then print NL_hello_world.
        //    If we were capturing System.out, we would expect to see "Hallo Wereld" in the output.
    }

    @Test
    void testPrintForFrenchLanguage() {
        properties.setProperty("configured_language", "FR");
        properties.setProperty("FR_hello_world", "Bonjour le monde");

        springService.print();
    }

    @Test
    void testPrintForDefaultLanguage() {
        properties.setProperty("configured_language", "EN");

        springService.print();  // Should print "native_hello_world"
    }
}
