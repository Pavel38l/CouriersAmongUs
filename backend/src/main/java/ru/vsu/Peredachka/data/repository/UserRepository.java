package ru.vsu.Peredachka.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import ru.vsu.Peredachka.data.entity.User;

import java.util.Optional;

@Component
public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
