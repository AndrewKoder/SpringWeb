package com.example.springweb;

import com.example.springweb.logic.ISolvator;
import com.example.springweb.logic.SolvatorImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// класс-конфиг для DI
@Configuration
public class AppConfig {
    // бин для решателя
    @Bean
    ISolvator solvator() {
        return new SolvatorImpl();
    }
}
