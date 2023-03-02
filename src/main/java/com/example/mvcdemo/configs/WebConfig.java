package com.example.mvcdemo.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.mvcdemo.formatter.PhoneFormatter;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatter(new PhoneFormatter());
    }

    
}
