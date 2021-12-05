package com.learning;

public class Main {

    public static void main(String[] args) {

        double x = 5;
        double y = 7;
        Figure figure = new Figure(x, y);

        Figure circle = new Circle(x);
        Figure ellipse = new Ellipse(x, y);

        Figure square = new Square(x);
        Figure rectangle = new Rectangle(x, y);

        System.out.println("Периметр фигуры: " + figure.getPerimeter());
        System.out.println("Периметр круга: " + circle.getPerimeter());
        System.out.println("Периметр овала: " + ellipse.getPerimeter());
        System.out.println("Периметр квадрата: " + square.getPerimeter());
        System.out.println("Периметр прямоугольника: " + rectangle.getPerimeter());

    }
}
