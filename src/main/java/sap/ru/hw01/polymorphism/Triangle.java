package sap.ru.hw01.polymorphism;

import org.springframework.stereotype.Component;

@Component
public class Triangle extends Shape{

    @Override
    public void draw() {
        System.out.println("drawing triangle");
    }
}
