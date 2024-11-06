package org.joris;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public SpringService service() {
        return new SpringService();
    }
}
