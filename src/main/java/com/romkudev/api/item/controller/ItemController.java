package com.romkudev.api.item.controller;

import com.romkudev.api.item.domain.Item;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/items")
public class ItemController {

//    @GetMapping("/")
//    public String home() {
//        return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
//    }

    @GetMapping()
    public List<Item> findAll() {
        return null;
    }

    @GetMapping("/{id}")
    public Optional<Item> findById(@PathVariable Long id) {
        return Optional.empty();
    }

    @PostMapping
    public void save(Item item) {

    }

    @PutMapping
    public void update(Item item) {

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
