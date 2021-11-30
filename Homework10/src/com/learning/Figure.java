package com.learning;

// Сделать класс Figure из задания 09 абстрактным.
public abstract class Figure {
    protected double centerX; // геометрический центр по оси x
    protected double centerY; // геометрический центр по оси y
    protected double width; // длина стороны по оси х
    protected double height; // длина стороны по оси y

    /**
     * Метод должен вычислять периметр фигуры.
     * @return Возвращает периметр фигуры.
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

}
