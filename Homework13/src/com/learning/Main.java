package com.learning;

public class Main {

    public static void main(String[] args) {
        int[] array = {13, 12, 423, 213, 777, 9, 986, -1, -990};

	    // проверка на четность элемента
        int[] evenNumbers = Sequence.filter(array, number -> (number % 2) == 0);

        // проверка, является ли сумма цифр элемента четным числом
        int[] evenSummNumbers = Sequence.filter(array, number -> {
            int summ = 0;
            number = Math.abs(number);

            while (number > 0) {
                summ += number % 10;
                number /= 10;
            }

            return (summ % 2) == 0;
        });

        Sequence.printArray(array, "Исходный массив");
        Sequence.printArray(evenNumbers, "Четные числа");
        Sequence.printArray(evenSummNumbers, "Числа с четной суммой элементов");

    }
}
