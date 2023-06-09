package com.learning;

public class Figure {
    protected double centerX; // геометрический центр по оси x
    protected double centerY; // геометрический центр по оси y

    public Figure(double centerX, double centerY) {
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public double getCenterX() {
        return centerX;
    }

    public void setCenterX(double centerX) {
        this.centerX = centerX;
    }

    public double getCenterY() {
        return centerY;
    }

    public void setCenterY(double centerY) {
        this.centerY = centerY;
    }

    public double getPerimeter () {
        return 0;
    }
}
