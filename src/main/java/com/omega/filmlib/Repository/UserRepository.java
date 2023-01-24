package com.omega.filmlib.Repository;

import com.omega.filmlib.Entity.Author;
import com.omega.filmlib.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

    Optional<User> findUserByEmail(String email);

    Optional<User> findUserById(String id);

}
