package repository;

public class User {
    private int id;
    private String name;
    private int age;
    private boolean isWorker;

    public User(int id, String name, int age, boolean isWorker) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.isWorker = isWorker;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isWorker() {
        return isWorker;
    }

    public void setWorker(boolean worker) {
        isWorker = worker;
    }

    @Override
    public String toString() {
        return getId() + " " + getName() + " " + getAge() + " " + isWorker();
    }
}
