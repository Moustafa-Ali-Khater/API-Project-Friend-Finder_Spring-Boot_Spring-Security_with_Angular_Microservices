package com.user.management.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(new Info().title("User Management")
                        .description("MicroService to manage Security")
                        .contact(new Contact().name("Mostafa Ali Khater")
                        .email("mostafaaliramadan08@gmail.com")));
    }
}
