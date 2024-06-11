package com.example.gerenciamentoprojetos.controller;

import com.example.gerenciamentoprojetos.model.Tarefa;
import com.example.gerenciamentoprojetos.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {
    @Autowired
    private TarefaService tarefaService;

    @PostMapping
    public Tarefa criarTarefa(@RequestBody Tarefa tarefa) {
        return tarefaService.criarTarefa(tarefa);
    }

    @GetMapping
    public List<Tarefa> obterTodasTarefas() {
        return tarefaService.obterTodasTarefas();
    }

    @GetMapping("/{id}")
    public Tarefa obterTarefaPorId(@PathVariable Long id) {
        return tarefaService.obterTarefaPorId(id);
    }

    @PutMapping("/{id}")
    public Tarefa atualizarTarefa(@PathVariable Long id, @RequestBody Tarefa tarefa) {
        return tarefaService.atualizarTarefa(id, tarefa);
    }

    @DeleteMapping("/{id}")
    public void deletarTarefa(@PathVariable Long id) {
        tarefaService.deletarTarefa(id);
    }
}
