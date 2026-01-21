package com.example.swaggerdemo.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GroupedOpenApiConfig {

    @Bean
    public GroupedOpenApi publicApis(){
        return GroupedOpenApi.builder()
                .group("Public APIs")
                .pathsToMatch("/api/**")
                .build();
    }

    @Bean
    public GroupedOpenApi adminApis(){
        return GroupedOpenApi.builder()
                .group("Admin APIs")
                .pathsToMatch("/admin/**")
                .build();
    }
}
