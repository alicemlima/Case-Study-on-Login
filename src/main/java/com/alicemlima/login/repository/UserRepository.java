package com.alicemlima.login.repository;


import com.alicemlima.login.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
