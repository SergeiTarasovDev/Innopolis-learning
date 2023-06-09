package com.learning;

import java.util.ArrayList;

public class Main {

    /**
     * print array on screen
     * @param persons array with persons, for print screen
     */
    private static void readPersonArray(ArrayList<Person> persons) {
        for (Person person: persons) {
            System.out.println(person.getName() + ": " + person.getWeight());
        }
        System.out.println();
    }

    /**
     * Sorts an array of Person. On increasing weight. Selection sort method.
     * @param persons Array for sort
     * @return Sorted array
     */
    public static ArrayList<Person> sortPersonArray(ArrayList<Person> persons) {
        Person temp = new Person("temp", 0);
        for (int i = 0; i < persons.size(); i++) {
            int indexMinWeight = i;
            double minWeight = persons.get(i).getWeight();
            for (int j = i + 1; j < persons.size(); j++) {
                if (persons.get(j).getWeight() < minWeight) {
                    indexMinWeight = j;
                    minWeight = persons.get(j).getWeight();
                }
            }
            temp = persons.get(i);
            persons.set(i, persons.get(indexMinWeight));
            persons.set(indexMinWeight, temp);
        }

        return persons;
    }

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Ирина", 48.3));
        persons.add(new Person("Антон", 71.5));
        persons.add(new Person("Сергей", 75.1));
        persons.add(new Person("Елена", 51.5));
        persons.add(new Person("Илья", 68));
        persons.add(new Person("Александр", 65.8));
        persons.add(new Person("Роман", 84.7));
        persons.add(new Person("Екатерина", 46.3));
        persons.add(new Person("Анна", 47.4));
        persons.add(new Person("Владимир", 92));

        readPersonArray(persons);
        readPersonArray(sortPersonArray(persons));
    }

    static class Person {
        private String name;
        private double weight;

        public Person(String name, double weight) {
            this.name = name;
            if (weight > 0 && weight < 500) {
                this.weight = weight;
            }
        }

        public String getName() {
            return name;
        }

        public double getWeight() {
            return weight;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }
    }
}
