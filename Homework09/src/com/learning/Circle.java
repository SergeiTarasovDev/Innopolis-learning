package com.learning;

public class Circle extends Ellipse {
    public Circle (double x) {
        super(x, x);
    }

    public double getPerimeter() {
        return Math.PI * this.x;
    }
}
