package com.learning;

public class Circle extends Ellipse {
    public Circle(double centerX, double centerY, double radius) {
        super(centerX, centerY, radius, radius);
    }

    public double getPerimeter() {
        if (this.verticalRadius <= 0) {
            return 0;
        }
        return Math.PI * this.verticalRadius;
    }
}
