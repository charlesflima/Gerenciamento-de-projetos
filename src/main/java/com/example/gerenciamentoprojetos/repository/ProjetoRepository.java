package com.example.gerenciamentoprojetos.repository;

import com.example.gerenciamentoprojetos.model.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
}

