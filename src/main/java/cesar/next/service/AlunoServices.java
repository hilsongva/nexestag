package cesar.next.service;

import cesar.next.dao.AlunoDAO;
import cesar.next.entity.Aluno;
import cesar.next.entity.Experiencias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServices {
    @Autowired
    AlunoDAO alunoDAO;

    public void salvar(Aluno aluno){
        alunoDAO.save(aluno);
    }

    public List<Aluno> findAll(){
        return alunoDAO.findAll();
    }

    public void deletar(Aluno aluno){
        alunoDAO.delete(aluno);

    }

}
