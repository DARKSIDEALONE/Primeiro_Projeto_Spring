package senai.gabriel.atividadeprojetospring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import senai.gabriel.atividadeprojetospring.models.LivroModel;
import senai.gabriel.atividadeprojetospring.services.LivroService;

import java.util.List;
@RestController
@RequestMapping(value = "/livro")
public class LivrosController {
    @Autowired
    private LivroService livroService;
    @GetMapping
    public ResponseEntity<List<LivroModel>> getAllLivros(){
        return ResponseEntity.ok().body(livroService.findAll());
    }

}
