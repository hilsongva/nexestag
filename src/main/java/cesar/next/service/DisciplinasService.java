package cesar.next.service;

import cesar.next.dao.DisciplinasDAO;
import cesar.next.entity.Cursos;
import cesar.next.entity.Disciplinas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplinasService {
    @Autowired
    DisciplinasDAO disciplinasDAO;

    public void salvar(Disciplinas disciplinas){
        disciplinasDAO.save(disciplinas);
    }

    public List<Disciplinas> findAll(){
        return disciplinasDAO.findAll();
    }

    public void deletar(Disciplinas disciplinas){
        disciplinasDAO.delete(disciplinas);

    }

}
