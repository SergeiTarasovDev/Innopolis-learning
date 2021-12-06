package com.learning;

public class Main {

// Homework 11. Task.
// Сделать класс Logger с методом void log(String message), который выводит в консоль какое-либо сообщение.
// Применить паттерн Singleton для Logger.

    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Hello");
        System.out.println("Last message: " + logger2.getLastMessage()); // ожидается значение такое же как у объекта logger1 (Hello)
        logger2.log("Buy!");
        System.out.println("Last message: " + logger1.getLastMessage()); // ожидается значение такое же как у объекта logger2 (Buy!)
    }
}
