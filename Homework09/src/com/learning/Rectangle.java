package com.learning;

public class Rectangle extends Figure {
    public Rectangle (double x, double y) {
        super(x, y);
    }

    public double getPerimeter() {
        return (this.x + this.y) * 2;
    }
}
