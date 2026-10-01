package com.example.demo1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.apache.catalina.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.stream.Collectors;

@Entity
public class Account implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // ...
    private String email;
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        /* Mapea los roles del usuario a GrantedAuthority.
         * Tu entidad Account tiene un método getRoles() que devuelve
         * una lista de strings con los nombres de los roles (ej: ["ADMIN", "USER"]).
         */
        return User.getRoles().stream()
                .map(role -> new SimpleGrantedAuthority("ROLE_" + role.getName()))
                .collect(Collectors.toList());
    }

    public String getPassword() {
        return password; }

    @Override
    public String getUsername() { return this.email; }

    // ...
}
