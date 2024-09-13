package ru.kvshe.homework.repositories;

import lombok.Getter;
import org.springframework.stereotype.Repository;
import ru.kvshe.homework.model.User;

import java.util.ArrayList;
import java.util.List;

@Repository
@Getter
public class DB {
    private final List<User> users;

    {
        users = new ArrayList<>();
        users.add(new User(1, "Jonny", "Depp"));
        users.add(new User(2, "Bob", "Marly"));
        users.add(new User(3, "Jack", "Black"));
        users.add(new User(4, "Jane", "Air"));
    }
}
