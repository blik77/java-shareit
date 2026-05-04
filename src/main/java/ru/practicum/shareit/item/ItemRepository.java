package ru.practicum.shareit.item;

import ru.practicum.shareit.item.model.Item;

import java.util.*;

public interface ItemRepository {

    List<Item> findAll();

    List<Item> findAllByOwner(Long ownerId);

    Optional<Item> findById(Long id);

    Item save(Item item);

    Item update(Item item);

    void deleteById(Long id);

    boolean existsById(Long id);

    List<Item> searchByText(String text);

    boolean isOwner(Long itemId, Long userId);
}
