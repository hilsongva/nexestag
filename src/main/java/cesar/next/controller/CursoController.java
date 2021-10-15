package cesar.next.controller;

import cesar.next.entity.Aluno;
import cesar.next.entity.Cursos;
import cesar.next.entity.Experiencias;
import cesar.next.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {
    @Autowired
    private CursoService cursoService;

    @GetMapping("/all")
    public ResponseEntity<List<Cursos>> findAll() {
        List<Cursos> cursos = cursoService.findAll();
        return ResponseEntity.ok().body(cursos);
    }

    @PostMapping("/")
    public ResponseEntity<Void>save(@RequestBody Cursos cursos) throws URISyntaxException {
        cursoService.salvar(cursos);
        return ResponseEntity.created(new URI("/"+cursos.getCOURSE_ID())).build();


    }

}
