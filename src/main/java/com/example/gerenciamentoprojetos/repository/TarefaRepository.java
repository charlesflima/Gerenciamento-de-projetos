package com.example.gerenciamentoprojetos.repository;

import com.example.gerenciamentoprojetos.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
