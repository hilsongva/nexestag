package cesar.next.controller;

import cesar.next.entity.Cursos;
import cesar.next.entity.Experiencias;
import cesar.next.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
