package com.lab.rub.diexample;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@PropertySource("application.yml")
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    @Value("${car.name}")
    private String nameOfCar;

}
