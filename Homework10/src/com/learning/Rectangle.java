package com.learning;

public class Rectangle extends Figure {
    public Rectangle (double width, double height, double centerX, double centerY) {
        this.width = width;
        this.height = height;
        this.centerX = centerX;
        this.centerY = centerY;
    }

    @Override
    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }
}
