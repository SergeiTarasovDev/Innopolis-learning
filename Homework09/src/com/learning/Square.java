package com.learning;

public class Square extends Rectangle {
    public Square (double x) {
        super(x, x);
    }

    public double getPerimeter () {
        return this.x * 4;
    }
}
