package repository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UsersRepositoryFileImpl implements UsersRepository {
    private String fileName;

    public UsersRepositoryFileImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        Reader reader = null;
        BufferedReader bufferedReader = null;
        try {
            reader = new FileReader(fileName);
            bufferedReader = new BufferedReader(reader);
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] parts = line.split("\\|");
                String name = parts[0];
                int age = Integer.parseInt(parts[1]);
                boolean isWorker = Boolean.parseBoolean(parts[2]);
                User newUser = new User(name, age, isWorker);
                users.add(newUser);

                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException ignore) {}
            }
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException ignore) {}
            }
        }

        return users;
    }

    @Override
    public void save(User user) {
        Writer writer = null;
        BufferedWriter bufferedWriter = null;
        try {
            writer = new FileWriter(fileName, true);
            bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write(user.getName() + "|" + user.getAge() + "|" + user.isWorker());
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException ignore) {}

            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException ignore) {}
        }
    }

    @Override
    public List<User> findByAge(int age) {
        // TODO: реализовать
        List<User> users = this.findAll();
        List<User> result = new ArrayList<>();

        for (User user: users) {
            if (user.getAge() == age) {
                result.add(user);
            }
        }

        return result;
    }

    @Override
    public List<User> findByIsWorkerIsTrue() {
        // TODO: реализовать
        List<User> users = this.findAll();
        List<User> result = new ArrayList<>();

        for (User user: users) {
            if (user.isWorker()) {
                result.add(user);
            }
        }

        return result;
    }
}
