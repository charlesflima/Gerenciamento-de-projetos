package com.example.gerenciamentoprojetos.repository;


import com.exemplo.demo.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}