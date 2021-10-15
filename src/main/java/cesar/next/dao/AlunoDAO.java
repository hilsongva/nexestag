package cesar.next.dao;

import cesar.next.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoDAO extends JpaRepository<Aluno, Long> {
    Aluno findByCpf(String cpf);

    }
