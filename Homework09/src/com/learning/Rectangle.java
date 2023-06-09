package com.learning;

public class Rectangle extends Figure {
    protected double width;
    protected double height;

    public Rectangle(double centerX, double centerY, double width, double height) {
        super(centerX, centerY);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPerimeter() {
        if (this.width <= 0 || this.height <= 0) {
            return 0;
        }
        return (this.width + this.height) * 2;
    }


}
