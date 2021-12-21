package com.learning;

// Сделать класс Figure из задания 09 абстрактным.
public abstract class Figure {

    protected double centerX; // геометрический центр по оси x
    protected double centerY; // геометрический центр по оси y
    protected double width; // длина стороны по оси х
    protected double height; // длина стороны по оси y

    /**
     * Calculating the perimeter of a shape
     * @return return perimeter.
     */
    public abstract double getPerimeter ();

    public double getCenterX() {
        return centerX;
    }

    public double getCenterY() {
        return centerY;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setCenterX(double centerX) {
        this.centerX = centerX;
    }

    public void setCenterY(double centerY) {
        this.centerY = centerY;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
