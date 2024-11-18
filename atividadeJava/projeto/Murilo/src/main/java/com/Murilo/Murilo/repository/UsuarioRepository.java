package com.Murilo.Murilo.repository;

import com.Murilo.Murilo.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository extends JpaRepository<User, String> {
     UserDetails findByLogin(String login);
}
