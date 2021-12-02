package com.learning;

public class Sequence {

    /**
     * Метод выполняет фильтрацию массива по условию
     * @param array Исходный массив
     * @param condition Условие отбора элементов
     * @return Массив, содержащий элементы из исходного массива, соответствующие условию
     */
    public static int[] filter(int[] array, ByCondition condition) {
        int[] temp = new int[array.length];
        int current = 0;
        for (int element: array) {
            if (condition.isOk(element)) {
                temp[current] = element;
                current++;
            }
        }

        // Убрать пустые элементы из массива
        int[] result = new int[current];
        for (int i = 0; i < result.length; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    /**
     * Метод выводит в консоль эелементы массива
     * @param array Массив, содержащий элементы для вывода
     * @param message Сообщение, содержащее пояснение к массиву
     */
    public static void printArray(int[] array, String message) {
        System.out.println();
        System.out.println(message + ":");
        for (int element: array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
