package com.lab.rub.diexample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestEmployee {
    public static void main(String[] args) {
        var context =
                new AnnotationConfigApplicationContext(EmployeeConfig.class);
        Employee employee = context.getBean(Employee.class);
        System.out.println(employee);

        context.close(); // если не закрыть бин не уничтожиться
    }
}
