package service;


import com.exemplo.demo.model.Projeto;
import com.exemplo.demo.repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetoService {
    @Autowired
    private ProjetoRepository projetoRepository;

    public Projeto criarProjeto(Projeto projeto) {
        return projetoRepository.save(projeto);
    }

    public List<Projeto> obterTodosProjetos() {
        return projetoRepository.findAll();
    }

    public Projeto obterProjetoPorId(Long id) {
        return projetoRepository.findById(id).orElse(null);
    }

    public Projeto atualizarProjeto(Long id, Projeto projeto) {
        Projeto existente = projetoRepository.findById(id).orElse(null);
        if (existente != null) {
            existente.setNome(projeto.getNome());
            return projetoRepository.save(existente);
        }
        return null;
    }

    public void deletarProjeto(Long id) {
        projetoRepository.deleteById(id);
    }
}
