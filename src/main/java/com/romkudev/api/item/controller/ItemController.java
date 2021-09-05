package com.romkudev.api.item.controller;

import com.romkudev.api.item.domain.Item;
import com.romkudev.api.item.service.ItemService;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
//@CrossOrigin(origins = "*", allowCredentials = "false")
@RequestMapping("/items")
public class ItemController {

    private final ItemService itemService;

//    @GetMapping("/")
//    public String home() {
//        return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
//    }

    @GetMapping()
    public ResponseEntity<List<Item>> findAll() {
        return ResponseEntity.ok().body(itemService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Item>> findById(@PathVariable Long id) {
        return ResponseEntity.ok(itemService.findById(id));
    }

    @PostMapping
    public void save(Item item) {
        itemService.save(item);
    }

    @PutMapping
    public void update(Item item) {
    }

    @GetMapping("/exists/{id}")
    public ResponseEntity<Boolean> existsById(@PathVariable Long id) {
        return ResponseEntity.ok(itemService.existsById(id));
    }

    @GetMapping("/count")
    public ResponseEntity<Long> count() {
        return ResponseEntity.ok(itemService.count());
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        itemService.deleteById(id);
    }

    @DeleteMapping
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 403, message = "Access Denied"),
            @ApiResponse(code = 422, message = "Item is already in use")})
    public void deleteAll() {
        itemService.deleteAll();
    }
}
