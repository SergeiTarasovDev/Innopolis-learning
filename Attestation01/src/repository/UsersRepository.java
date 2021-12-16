package repository;

import java.util.List;

public interface UsersRepository {
    List<User> findAll();
    void save(User user);
    User findById(int id);
    void update(User user);
}
