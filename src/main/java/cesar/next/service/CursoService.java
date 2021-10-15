package cesar.next.service;

import cesar.next.dao.CursosDAO;
import cesar.next.entity.Aluno;
import cesar.next.entity.Cursos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {
    @Autowired
    CursosDAO cursosDAO;

    public void salvar(Cursos cursos){
        cursosDAO.save(cursos);
    }

    public List<Cursos> findAll(){
        return cursosDAO.findAll();
    }

    public void deletar(Cursos cursos){
        cursosDAO.delete(cursos);

    }

}
