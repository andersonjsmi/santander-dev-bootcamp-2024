package me.dio.service;

import me.dio.domain.models.User;

public interface UserService {
    User findById(Long id);
    User create(User user);
}
