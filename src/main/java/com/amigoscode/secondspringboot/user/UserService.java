package com.amigoscode.secondspringboot.user;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> users;


    public UserService() {
        System.out.println("çalıştım");
        users = new ArrayList<>();
        User user1 = new User(
                "Tuğçe",
                "Altın",
                26,
                LocalDate.now(),
                UUID.randomUUID()
        );
        User user2 = new User(
                "Ekrem",
                "Altın",
                28,
                LocalDate.now(),
                UUID.randomUUID()
        );

        users.add(user1);
        users.add(user2);
    }

    public List<User> getAllUsers() {

        return users;
    }

    public List<User> getUsersByName(String name) {
        List<User> list = new ArrayList<>();
        for (User user : users) {
            if (user.getName().contains(name)) {
                list.add(user);
            }
        }
        return list;
    }

    public User createUser(User user) {
        User newUser = new User(user.getName(), user.getSurname(), user.getAge(), LocalDate.now(), UUID.randomUUID());
        users.add(newUser);

        return newUser;
    }
}
