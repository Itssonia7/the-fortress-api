package com.fortress.api.repository;

import com.fortress.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Custom query to find a user by their username (Spring JPA creates the query automatically!)
    Optional<User> findByUsername(String username);
}