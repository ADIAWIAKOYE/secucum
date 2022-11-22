package com.example.secucom;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo  extends JpaRepository<User, Long> {
  User findByNom(String nom);

  User findByIduser(Long iduser);
}
