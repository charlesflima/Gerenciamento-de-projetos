package com.example.gerenciamentoprojetos.repository;

import com.example.gerenciamentoprojetos.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
