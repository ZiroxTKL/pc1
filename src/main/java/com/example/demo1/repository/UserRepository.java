package com.example.demo1.repository;

import com.example.demo1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmailAndPassword(String email, String password);
    User findById(long id);
    User findByEmail(String email, @PageableDefault Pageable pageable);
    User findByUsername(String username, @PageableDefault Pageable pageable);
}
