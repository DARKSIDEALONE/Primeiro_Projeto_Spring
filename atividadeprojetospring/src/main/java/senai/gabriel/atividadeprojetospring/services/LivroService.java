package senai.gabriel.atividadeprojetospring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import senai.gabriel.atividadeprojetospring.models.LivroModel;
import senai.gabriel.atividadeprojetospring.repositories.LivroRepository;

import java.util.List;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;

    public List<LivroModel> findAll() {
        List<LivroModel> livro = livroRepository.findAll();
        return livro;

    }
}