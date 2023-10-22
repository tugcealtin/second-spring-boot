package com.amigoscode.secondspringboot.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(path = "{name}")
    public List<User> getUserByName(@PathVariable String name) {
        return userService.getUsersByName(name);
    }


    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }
}
