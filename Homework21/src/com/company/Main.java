package com.company;

import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int array[];

    public static int sums[];

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество чисел:");
        try {
            int numbersCount = scanner.nextInt();

            if (numbersCount < 0) {
                numbersCount = Math.abs(numbersCount);
                System.out.println("Вы ввели отрицательное количество чисел, оно было исправлено на положительное: " + numbersCount);
            } else if (numbersCount == 0) {
                throw new IllegalArgumentException();
            }

            System.out.println("Введите количество потоков:");
            int threadsCount = scanner.nextInt();
            if (threadsCount < 0) {
                threadsCount = Math.abs(threadsCount);
                System.out.println("Вы ввели отрицательное количество потоков, оно было исправлено на положительное: " + threadsCount);
            } else if (threadsCount == 0) {
                throw new IllegalArgumentException();
            }

            if (threadsCount > numbersCount) {
                System.out.println("Вы ввели больше потоков, чем чисел, количество потоков будет уменьшено.");
                threadsCount = numbersCount;
            }

            array = new int[numbersCount];
            sums = new int[threadsCount];

            for(int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(100);
            }

            int realSum = 0;
            for (int i = 0; i < array.length; i++) {
                realSum += array[i];
            }

            System.out.println("\nЭталон результата: " + realSum);

            int numbersCountInThread = numbersCount / threadsCount;

            for (int i = 0; i < threadsCount; i++) {
                int from = i * numbersCountInThread;
                int to = (i + 1) * numbersCountInThread - 1;

                if (numbersCount - to < numbersCountInThread) {
                    to = numbersCount-1;
                }

                SumThread sumThread = new SumThread(i, from, to);
                sumThread.start();
                try {
                    sumThread.join();
                } catch (InterruptedException e) {
                    throw new IllegalArgumentException(e);
                }

            }

            int byThreadSum = 0;

            for (int i = 0; i < threadsCount; i++) {
                byThreadSum += sums[i];
            }

            System.out.println("Результат работы потоков: " + byThreadSum + "\n");

            if (realSum == byThreadSum) {
                System.out.println("Результаты равны");
            } else {
                System.out.println("ОШИБКА: Результаты не равны");
            }
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не число, программа прекращает свою работу");
        } catch (IllegalArgumentException e) {
            System.out.println("Вы ввели 0, программа прекращает свою работу");
        }
    }
}
