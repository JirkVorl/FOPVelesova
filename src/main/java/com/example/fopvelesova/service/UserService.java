package com.example.fopvelesova.service;

import com.example.fopvelesova.model.User;

public interface UserService {
    User add(User user);

    User getById(Long id);
}
