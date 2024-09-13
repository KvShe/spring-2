package ru.kvshe.homework.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.kvshe.homework.model.User;
import ru.kvshe.homework.repositories.UserRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public User findById(int id) {
        return userRepository.findById(id);
    }

    public User update(int id, User user) {
        return userRepository.update(id, user);
    }

    public void delete(int id) {
        userRepository.delete(id);
    }
}
