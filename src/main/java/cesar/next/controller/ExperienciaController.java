package cesar.next.controller;

import cesar.next.dao.ExperienciaDAO;
import cesar.next.entity.Experiencias;
import cesar.next.service.ExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/experiencias")
public class ExperienciaController {
    @Autowired
    private ExperienciaService experienciaService;
    private ExperienciaDAO experienciaDAO;

    //@GetMapping
    //public ResponseEntity<List<Experiencias>>findAll(){
        //List<Experiencias>experiencias = experienciaService.findall();

}

