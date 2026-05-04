package ru.practicum.shareit.user;

import ru.practicum.shareit.user.model.User;

import java.util.List;

public interface UserRepository {
    List<User> findAll();

    User findById(Long id);

    User save(User user);

    User update(User user);

    void deleteById(Long id);

    boolean existsByEmail(String email);

    boolean existsById(Long id);
}
