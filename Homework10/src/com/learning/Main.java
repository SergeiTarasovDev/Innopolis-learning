package com.learning;

import java.util.ArrayList;

public class Main {

    public static void print(Figure figure) {
        System.out.println(figure.getCenterX() + ", " + figure.getCenterY());
    }

    public static void main(String[] args) {

        // Начальные значения
        Circle circle1 = new Circle(4, 3, 7);
        Circle circle2 = new Circle(3, -1, 12);
        Square square1 = new Square(2, 9, 3);
        Square square2 = new Square(7, 12, -10);

        print(circle1);
        print(circle2);
        print(square1);
        print(square2);

        // В Main создать массив "перемещаемых" фигур и сдвинуть все их в одну конкретную точку.
        Relocatable[] relocatables = new Relocatable[4];
        relocatables[0] = circle1;
        relocatables[1] = circle2;
        relocatables[2] = square1;
        relocatables[3] = square2;

        for (Relocatable relocatable: relocatables) {
            relocatable.setPosition(3, 2);
        }

        System.out.println();
        print(circle1);
        print(circle2);
        print(square1);
        print(square2);

    }
}
