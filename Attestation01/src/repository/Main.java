package repository;

import java.util.*;

public class Main {

    public static void main(String[] args) {

	    UsersRepository usersRepository = new UsersRepositoryFileImpl("users.txt");

        User user = usersRepository.findById(1);
        System.out.print(user.toString());

        user.setName("Марсель");
        user.setAge(27);
        user.setWorker(true);
        usersRepository.update(user);

        UsersRepository usersRepository2 = new UsersRepositoryFileImpl("users.txt");
        User user2 = usersRepository2.findById(1);
        System.out.println(" -> " + user2.toString());

    }
}
