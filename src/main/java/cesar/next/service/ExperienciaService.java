package cesar.next.service;

import cesar.next.dao.ExperienciaDAO;
import cesar.next.entity.Experiencias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienciaService {
    @Autowired
    ExperienciaDAO experienciaDAO;

    public void salvar(Experiencias experiencias){
        experienciaDAO.save(experiencias);
    }

    public List<Experiencias> findAll(){
       return experienciaDAO.findAll();
    }

    public void deletar(Experiencias experiencias){
        experienciaDAO.delete(experiencias);



    }
}

