package com.example.gerenciamentoprojetos.controller;

import com.example.gerenciamentoprojetos.model.Projeto;
import com.example.gerenciamentoprojetos.service.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {
    @Autowired
    private ProjetoService projetoService;

    @PostMapping
    public Projeto criarProjeto(@RequestBody Projeto projeto) {
        return projetoService.criarProjeto(projeto);
    }

    @GetMapping
    public List<Projeto> obterTodosProjetos() {
        return projetoService.obterTodosProjetos();
    }

    @GetMapping("/{id}")
    public Projeto obterProjetoPorId(@PathVariable Long id) {
        return projetoService.obterProjetoPorId(id);
    }

    @PutMapping("/{id}")
    public Projeto atualizarProjeto(@PathVariable Long id, @RequestBody Projeto projeto) {
        return projetoService.atualizarProjeto(id, projeto);
    }

    @DeleteMapping("/{id}")
    public void deletarProjeto(@PathVariable Long id) {
        projetoService.deletarProjeto(id);
    }
}

