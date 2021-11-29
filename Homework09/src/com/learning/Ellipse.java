package com.learning;

public class Ellipse extends Figure {

    public Ellipse (double x, double y) {
        super(x, y);
    }

    public double getPerimeter() {
        return 2 * Math.PI * Math.sqrt((this.x * this.x + this.y * this.y) / 8);
    }
}
