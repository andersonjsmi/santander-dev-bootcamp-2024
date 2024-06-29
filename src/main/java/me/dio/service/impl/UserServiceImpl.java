package me.dio.service.impl;

import me.dio.domain.models.User;
import me.dio.domain.repository.UserRepository;
import me.dio.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    public UserServiceImpl(UserRepository userRepository) {
        this.repository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return repository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User user) {
        if(repository.existsByAccountNumber(user.getAccount().getNumber()))
            throw new IllegalArgumentException("This User ID already existis");
        return repository.save(user);
    }
}
