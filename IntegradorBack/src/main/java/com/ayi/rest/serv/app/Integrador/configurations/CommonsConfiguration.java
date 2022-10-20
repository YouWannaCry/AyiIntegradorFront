package com.ayi.rest.serv.app.Integrador.configurations;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.ayi.rest.serv.app.Integrador.configurations" +
        "com.ayi.rest.serv.app.Integrador.services" +
        "com.ayi.rest.serv.app.Integrador.mapper" +
        "com.ayi.rest.serv.app.Integrador.repository"})

public class CommonsConfiguration {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}