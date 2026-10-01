package com.example.demo1.repository;

import com.example.demo1.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;

public interface AccountRepository extends JpaRepository<Account, Long> {
    ScopedValue<Object> findByEmail(String username);
}
