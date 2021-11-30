package com.learning;

// Данный интерфейс должны реализовать только классы Circle и Square.
public class Square extends Rectangle implements Relocatable {
    public Square (double width, double centerX, double centerY) {
        super(width, width, centerX, centerY);
    }

    public double getPerimeter () {
        return this.width * 4;
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
