package com.lab.rub.diexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {

    @Bean
    public Pet pet(){
        return new Pet("Kitty");
    }

    @Bean
    public Car car(){
        return new Car("Honda");
    }

    @Bean
    public Employee employee(){
        return new Employee("Ivan", 30,"Zavod",car(),pet());
    }
}
