package com.romkudev.api.user.controller;

import com.romkudev.api.user.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping()
    public List<User> findAll() {
        return null;
    }

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable Long id) {
        return Optional.empty();
    }

    @PostMapping
    public void save(User user) {

    }

    @PutMapping
    public void update(User user) {

    }

    @GetMapping("/exists/{id}")
    public boolean existsById(@PathVariable Long id) {
        return false;
    }

    @GetMapping("/count")
    public long count() {
        return 0;
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {

    }
}
