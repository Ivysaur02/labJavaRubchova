package com.lab.rub.diexample;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Employee {

    private String name;
    private int age;
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
    public Employee(String name, int age, String nameOfWork, Car car, Pet pet) {
        this.name = name;
        this.age = age;
        this.nameOfWork = nameOfWork;
        this.car = car;
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Hello my name is " + name + " this is my lovely pet " + pet.getName() + " in my " + car.getNameOfCar();
    }


}
