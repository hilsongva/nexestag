package cesar.next.dao;

import cesar.next.entity.Cursos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursosDAO extends JpaRepository<Cursos, Long> {
}
