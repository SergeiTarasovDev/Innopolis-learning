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
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                int age = Integer.parseInt(parts[2]);
                boolean isWorker = Boolean.parseBoolean(parts[3]);
                User newUser = new User(id, name, age, isWorker);
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

            bufferedWriter.write(user.getId() + "|" + user.getName() + "|" + user.getAge() + "|" + user.isWorker());
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
    public User findById(int id) {
        List<User> users = this.findAll();

        for (User user: users) {
            if (user.getId() == id) {
                return user;
            }
        }

        return null;
    }

    @Override
    public void update(User user) {
        List<User> users = this.findAll();

        try (Writer writer = new FileWriter(this.fileName, false); BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            bufferedWriter.write("");
            bufferedWriter.flush();
        } catch (IOException e) {
            System.err.println("Ошибка ввода-вывода");
        }

        for (User currentUser : users) {
            if (currentUser.getId() == user.getId()) {
                currentUser = user;
            }

            this.save(currentUser);
        }
    }
}
