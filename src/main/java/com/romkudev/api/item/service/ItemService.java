package com.romkudev.api.item.service;

import com.romkudev.api.item.domain.Item;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface ItemService {

    List<Item> findAll();

    Optional<Item> findById(Long id);

    void save(Item entity);

    boolean existsById(Long id);

    long count();

    void deleteAll();

    void deleteById(Long id);
}
