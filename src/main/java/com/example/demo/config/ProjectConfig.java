package com.example.demo.config;

         import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

         import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

         @Configuration
 public class ProjectConfig {
 @Bean
 OpenAPI openAPI() {
         return new OpenAPI().info(new Info()
                 .title("Hello, My name is Tung")
                 .version("3.0.1")
                 );
         }
 }
