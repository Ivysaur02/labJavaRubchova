package com.lab.rub.diexample;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
@NoArgsConstructor
public class Employee {
    @Setter
    @Value("${man.name}")
    private String name;
    @Setter
    @Value("${man.age}")
    private int age;
    @Setter
    @Value("${man.job}")
    private String nameOfWork;
    private Car car;
    private Pet pet;

    @PostConstruct
    public void init() {
        System.out.println("Class Person: init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Class Person: destroy method");
    }

    @Autowired
    public void setCar(Car car) {
        this.car = car;
    }

    @Autowired
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Hello my name is " + name + " this is my lovely pet " + pet.getName() + " in my " + car.getNameOfCar();
    }


}
