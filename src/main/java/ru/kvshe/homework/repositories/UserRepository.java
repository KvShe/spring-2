package ru.kvshe.homework.repositories;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.kvshe.homework.model.User;

import java.util.List;

@Repository
@AllArgsConstructor
public class UserRepository {
    private DB db;

    public List<User> findAll() {
        return db.getUsers();
    }

    public User save(User user) {
        db.getUsers().add(user);
        return user;
    }

    public User findById(int id) {
        return db.getUsers().stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public User update(int id, User newUser) {
        User oldUser = findById(id);
        oldUser.setName(newUser.getName());
        oldUser.setSurname(newUser.getSurname());
        return oldUser;
    }

    public void delete(int id) {
        db.getUsers().removeIf(user -> user.getId() == id);
    }
}
