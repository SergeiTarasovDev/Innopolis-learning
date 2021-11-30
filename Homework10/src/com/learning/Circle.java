package com.learning;

// Данный интерфейс должны реализовать только классы Circle и Square.
public class Circle extends Ellipse implements Relocatable {
    public Circle (double radius, double centerX, double centerY) {
        super(radius, radius, centerX, centerY);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * this.width;
    }

    /**
     * Метод перемещает фигуру на заданные координаты.
     * @param changeX новая координата по оси X
     * @param changeY новая координата по оси Y
     */
    @Override
    public void setPosition(double changeX, double changeY) {
        this.centerX = changeX;
        this.centerY = changeY;
    }
}
