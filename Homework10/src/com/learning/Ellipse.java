package com.learning;

public class Ellipse extends Figure {
    public Ellipse (double width, double height, double centerX, double centerY) {
        this.width = width;
        this.height = height;
        this.centerX = centerX;
        this.centerY = centerY;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * Math.sqrt((width * width + height * height) / 8);
    }
}
