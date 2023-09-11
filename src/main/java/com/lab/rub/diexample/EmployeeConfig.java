package com.lab.rub.diexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class EmployeeConfig {

    @Bean
    public Car carWithValue(){
        return new Car();
    }

    @Bean(name = "scoda car")
    public Car carNoValue(){
        return new Car("Scoda");
    }
    @Bean
    public Pet pet(){
        return new Pet();
    }

    @Bean
    public Employee employee(){
        return new Employee("Ivan", 30,"Zavod",carWithValue(),pet());
    }

}
