package com.lab.rub.diexample;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Employee {

    private String name;
    private int age;
    private String nameOfWork;
    private Car car;
    private Pet pet;

    @Override
    public String toString(){
        return "Hello my name is "+name+" this is my lovely pet " + pet.getName()+" in my "+ car.getNameOfCar();
    }


}
