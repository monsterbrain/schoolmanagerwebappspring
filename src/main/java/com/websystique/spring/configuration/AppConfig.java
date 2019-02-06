/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.websystique.spring.configuration;

/**
 *
 * @author monster
 */
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
 
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.websystique.spring")
public class AppConfig extends WebMvcConfigurerAdapter implements WebMvcConfigurer{
    
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
 
        return viewResolver;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // <mvc:resources mapping="/styles/**" location="/css/" />
        registry
            .addResourceHandler("/res/**") 
            .addResourceLocations("/res/") // webapp/css/
            .setCachePeriod(3600);
        
        /* .resourceChain(true) // Spring 4.1
        .addResolver(new GzipResourceResolver()) // Spring 4.1
        .addResolver(new PathResourceResolver()); // Spring 4.1*/
        // <mvc:resources mapping="/static/**" location="/static/" />
        /*registry.addResourceHandler("/res/**")
        .addResourceLocations("/res/", "classpath:/static/") // src/main/resources/static/
        .setCachePeriod(3600)
        .resourceChain(true)
        .addResolver(new PathResourceResolver());*/
    }
    
}
