package com.lab.rub.diexample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestEmployee {
    public static void main(String[] args) {
        var context =
                new AnnotationConfigApplicationContext(EmployeeConfig.class);
        Employee employee = context.getBean(Employee.class);
        System.out.println("First");
        System.out.println(employee);
        System.out.println("Second");
        Employee employee1 = context.getBean(Employee.class);
        System.out.println(employee1);
        System.out.println("Set new name");
        employee1.setName("Igor");
        System.out.println("First");
        System.out.println(employee);
        System.out.println("Second");
        System.out.println(employee1);


        context.close(); // если не закрыть бин не уничтожиться
    }
}
