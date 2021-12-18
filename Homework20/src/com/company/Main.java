package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // Номера все автомобилей, имющих черный цвет или нулевой пробег
        try (
                BufferedReader reader = new BufferedReader((new FileReader("input.txt")));
                BufferedReader reader2 = reader;
            )
        {

            System.out.println("Номера все автомобилей, имющих черный цвет или нулевой пробег");
            reader.lines()
                    .filter(line -> (line.split("\\|")[2].equals("Black")) || (line.split("\\|")[4].equals("0")))
                    .forEach(line -> System.out.println(line.split("\\|")[0]));
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
