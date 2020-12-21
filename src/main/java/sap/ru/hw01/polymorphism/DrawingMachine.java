package sap.ru.hw01.polymorphism;

import org.springframework.stereotype.Component;

@Component
public class DrawingMachine {
    private Shape shape;

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void drawShape() {
        shape.draw();
    }
}
