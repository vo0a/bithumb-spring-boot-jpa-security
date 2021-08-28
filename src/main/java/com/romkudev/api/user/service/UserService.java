package com.romkudev.api.user.service;

import com.romkudev.api.user.domain.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface UserService {

    List<User> findAll();

    Optional<User> findById(Long id);

    void save(User entity);

    boolean existsById(Long id);

    long count();

    void deleteById(Long id);
}
