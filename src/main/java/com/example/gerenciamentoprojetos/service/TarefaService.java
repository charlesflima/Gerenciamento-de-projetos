package com.example.gerenciamentoprojetos.service;

import com.example.gerenciamentoprojetos.model.Tarefa;
import com.example.gerenciamentoprojetos.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {
    @Autowired
    private TarefaRepository tarefaRepository;

    public Tarefa criarTarefa(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    public List<Tarefa> obterTodasTarefas() {
        return tarefaRepository.findAll();
    }

    public Tarefa obterTarefaPorId(Long id) {
        return tarefaRepository.findById(id).orElse(null);
    }

    public Tarefa atualizarTarefa(Long id, Tarefa tarefa) {
        Tarefa existente = tarefaRepository.findById(id).orElse(null);
        if (existente != null) {
            existente.setDescricao(tarefa.getDescricao());
            return tarefaRepository.save(existente);
        }
        return null;
    }

    public void deletarTarefa(Long id) {
        tarefaRepository.deleteById(id);
    }
}

