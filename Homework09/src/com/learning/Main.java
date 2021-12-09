package com.learning;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(-5, 10, 30);
        Ellipse ellipse = new Ellipse(12, 19, 2, 3);

        Square square = new Square(-6, -7, 7);
        Rectangle rectangle1 = new Rectangle(22, 90, 12, 7);
        Rectangle rectangle2 = new Rectangle(22, 90, -12, -7); // проверка отрицательных сторон

        System.out.println("Периметр круга: " + circle.getPerimeter());
        System.out.println("Периметр овала: " + ellipse.getPerimeter());
        System.out.println("Периметр квадрата: " + square.getPerimeter());
        System.out.println("Периметр прямоугольника 1: " + rectangle1.getPerimeter());
        System.out.println("Периметр прямоугольника 2: " + rectangle2.getPerimeter());

    }
}
