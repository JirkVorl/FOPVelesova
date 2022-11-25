package com.example.fopvelesova.controller;

import com.example.fopvelesova.model.User;
import com.example.fopvelesova.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/by-id")
    public User findById(@RequestParam Long id) {
        return userService.getById(id);
    }

}
