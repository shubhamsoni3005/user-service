package com.example.userservice.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private final List<Map<String, String>> users = new ArrayList<>();

    @GetMapping
    public List<Map<String, String>> getUsers() {
        return users;
    }

    @PostMapping
    public Map<String, String> addUser(@RequestBody Map<String, String> user) {
        users.add(user);
        return user;
    }
}
