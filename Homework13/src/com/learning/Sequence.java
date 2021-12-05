package com.learning;

public class Sequence {

    /**
     * filtering an array by condition
     * @param array source array
     * @param condition condition for filtering
     * @return filtered array
     */
    // Task: Данный метод возвращает массив, который содержит элементы, удовлетворяющиие логическому выражению в condition.
    public static int[] filter(int[] array, ByCondition condition) {
        int[] temp = new int[array.length];
        int current = 0;
        for (int element: array) {
            if (element != 0 && condition.isOk(element)) {
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
     * print elements of array
     * @param array
     * @param comment
     */
    public static void printArray(int[] array, String comment) {
        System.out.println();
        System.out.println(comment + ":");
        for (int element: array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
