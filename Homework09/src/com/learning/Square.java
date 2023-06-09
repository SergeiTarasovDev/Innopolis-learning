package com.learning;

public class Square extends Rectangle {
    public Square(double centerX, double centerY, double width) {
        super(centerX, centerY, width, width);
    }

    public double getPerimeter () {
        if (this.width <= 0) {
            return 0;
        }
        return this.width * 4;
    }
}
