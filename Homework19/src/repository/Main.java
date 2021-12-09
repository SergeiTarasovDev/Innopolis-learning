package repository;

import java.util.*;

public class Main {

    public static void main(String[] args) {

	    UsersRepository usersRepository = new UsersRepositoryFileImpl("users.txt");
        List<User> users = usersRepository.findAll();
        System.out.println();
        printResult(users, "Список всех пользователей:");

        int findAge = 22;
        List<User> usersByAge = usersRepository.findByAge(findAge);
        printResult(usersByAge, "Список пользователей, возраст которых составляет " + findAge + " лет:");

        List<User> usersByIsWorker = usersRepository.findByIsWorkerIsTrue();
        printResult(usersByIsWorker, "Список работающих пользователей:");
    }

    public static void printResult(List<User> users, String message) {
        System.out.println(message);
        for (User user : users) {
            System.out.println(user.getAge() + " " + user.getName() + " " + user.isWorker());
        }
        if (users.isEmpty()) {
            System.out.println("Пользователи по заданным критериям не найдены");
        }
        System.out.println();
    }
}
