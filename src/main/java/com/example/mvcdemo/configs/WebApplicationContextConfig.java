// package com.example.mvcdemo.configs;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.ComponentScan;
// import org.springframework.format.FormatterRegistry;
// import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
// import org.springframework.web.servlet.view.InternalResourceViewResolver;

// import com.example.mvcdemo.formatter.PhoneFormatter;

// @ComponentScan("mvcdemo")
// public class WebApplicationContextConfig implements WebMvcConfigurer {

//     @Bean
//     public InternalResourceViewResolver gInternalResourceViewResolver() {
//         InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//         viewResolver.setPrefix("WEB-INF/jsp/");
//         viewResolver.setSuffix(".jsp");
//         return viewResolver;
//     }

//     public void addFormatters(FormatterRegistry registry) {
//         registry.addFormatter(new PhoneFormatter());
//     }
    
// }
