package cesar.next.entity;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Disciplinas implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="SKILLS_ID",nullable = false)
    private Long SKILLS_ID;

    @Column(name = "TIPO_SKILL", nullable = false)
    private String tipoSkill;

    @Column(name = "NOME_SKILL", nullable = false)
    private String nomeSkill;

    @Column(name = "DATA_SKILL", nullable = false)
    private String dataSkill;

    @Column(name = "RESUMO_SKILL", nullable = false)
    private String resumoSkill;

    @Column(name = "AVALIACAO_SKILL", nullable = false)
    private String avaliacaoSkill;

}
