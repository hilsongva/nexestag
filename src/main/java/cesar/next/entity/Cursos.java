package cesar.next.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="CURSOS")
public class Cursos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="COURSE_ID",nullable = false)
    private Long COURSE_ID;
    @Column(name = "NOME_CURSO", nullable = false)
    private String nomeCurso;
    @Column(name = "MODALIDADE_CURSO", nullable = false)
    private String modCurso;
    @Column(name = "TURNO_CURSO", nullable = false)
    private String turnoCurso;
    @Column(name = "CAMPUS_CURSO", nullable = false)
    private String campusCurso;
    @Column(name = "INICIO_CURSO", nullable = false)
    private String inicioCurso;
    @Column(name = "FIM_CURSO", nullable = false)
    private String fimCurso;

    @OneToMany
    @JoinColumn(name="SKILLS_ID")
    @Column(name = "DISCIPLINAS")
    private List<Cursos> disciplinas;

}
