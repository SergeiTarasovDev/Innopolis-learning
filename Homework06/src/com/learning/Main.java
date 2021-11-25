package com.learning;

public class Main {

    /**
     * Функция поиска числа в массиве.
     * @param array Массив, в котором ищем число
     * @param number Число, которое необходимо найти
     * @return Возвращает индекс переданного числа в массиве. Если такого числа в массиве нет, то возвращает -1.
     */
    public static int getIndexElement(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Процедура перемещает все числа > 0 в левую часть массива
     * @param array Массив, который необходимо обработать
     */
    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == 0) {
                    array[i] = array[j];
                    array[j] = 0;
                }
            }

            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {34, 0, 0, 14, 15, 0, 18, 0, 0, 1, 20};
        int number1 = 0;
        int number2 = 18;
        int number3 = 33;

        System.out.println(getIndexElement(array, number1)); // ожидаем 1
        System.out.println(getIndexElement(array, number2)); // ожидаем 6
        System.out.println(getIndexElement(array, number3)); // ожидаем -1

        printSortedArray(array);
    }
}
