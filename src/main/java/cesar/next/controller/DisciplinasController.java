package cesar.next.controller;

import cesar.next.entity.Aluno;
import cesar.next.entity.Disciplinas;
import cesar.next.entity.Experiencias;
import cesar.next.service.DisciplinasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/disciplinas")

public class DisciplinasController {
    @Autowired
    private DisciplinasService disciplinasService;

    @GetMapping("/all")
    public ResponseEntity<List<Disciplinas>> findAll() {
        List<Disciplinas> disciplinas = disciplinasService.findAll();
        return ResponseEntity.ok().body(disciplinas);
    }

    }


