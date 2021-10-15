package cesar.next.controller;

import cesar.next.entity.Aluno;
import cesar.next.entity.Experiencias;
import cesar.next.service.AlunoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoServices alunoServices;

    @GetMapping("/all")
    public ResponseEntity<List<Aluno>> findAll() {
        List<Aluno> alunos = alunoServices.findAll();
        return ResponseEntity.ok().body(alunos);
    }
    @PostMapping("/")
    public ResponseEntity<Void>save(@RequestBody Aluno aluno) throws URISyntaxException{
        alunoServices.salvar(aluno);
        return ResponseEntity.created(new URI("/"+aluno.getId())).build();


    }

}
