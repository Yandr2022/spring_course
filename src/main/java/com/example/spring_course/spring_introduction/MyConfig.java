package com.example.spring_course.spring_introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:myApp.properties")
//@ComponentScan("com.example.spring_course.spring_introduction")
public class MyConfig {
    @Bean
    public Pet catBean(){
        System.out.println("created catBean");
        return new Cat();
    }
    @Bean
    public Person personBean(){
        System.out.println("created personBean");
        return new Person(catBean());
    }
}
