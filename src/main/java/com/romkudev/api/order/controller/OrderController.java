package com.romkudev.api.order.controller;

import com.romkudev.api.order.domain.Order;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @GetMapping()
    public List<Order> findAll() {
        return null;
    }

    @GetMapping("/{id}")
    public Optional<Order> findById(@PathVariable Long id) {
        return Optional.empty();
    }

    @PostMapping
    public void save(Order order) {

    }

    @PutMapping
    public void update(Order order) {

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
