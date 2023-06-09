package com.learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    /**
     * Функция наполнения массива числами, вводимыми в консоль.
     * @return Возвращает массив с введенными числами.
     */
    public static ArrayList<Integer> generateArray() {
        ArrayList<Integer> arrayNumbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число от -100 до 100:");
        int a = scanner.nextInt();

        while (a != -1) {
            if (a >= -100 && a <= 100) {
                arrayNumbers.add(a);
            } else {
                System.out.println("Введенное число не соответствует условию задачи");
            }

            System.out.println("Введите следующее число от -100 до 100:");
            a = scanner.nextInt();
        }

        System.out.println("Исходный массив: " + arrayNumbers.toString());

        return arrayNumbers;
    }

    /**
     * Процедура ищет и выводит на экран числа, которые присутствуют в исходном массиве минимальное количество раз
     * @param arrayNumbers массив с числами, которые необходимо подсчитать
     */
    private static void minNumberOfTimes(ArrayList<Integer> arrayNumbers) {
        HashMap<Integer, Integer> mapResult = new HashMap<>();

        // Подсчитываю сколько раз встречается каждое число в массиве
        for (int value: arrayNumbers) {
            if (mapResult.containsKey(value)) {
                mapResult.put(value, mapResult.get(value) + 1);
            } else {
                mapResult.put(value, 1);
            }
        }
        System.out.println("Какое количество раз встречаются числа в исходном массиве: " + mapResult.toString());

        // Ищу числа, которые встретились минимальное количество раз
        int minCount = 2_147_483_647;
        ArrayList<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry: mapResult.entrySet()) {
            if (minCount >= entry.getValue()) {
                minCount = entry.getValue();
                result.add(entry.getKey());
            }
        }

        System.out.println("Наименьшее число раз встречаются следующие числа: " + result.toString());
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayNumbers = generateArray();
        minNumberOfTimes(arrayNumbers);
    }
}
