package cesar.next.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="EXPERIENCIAS")
public class Experiencias implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="EXPERIENCIAS_ID",nullable = false)
    private Long EXPERIENCIAS_ID;

    @Column(name = "TIPO_EXPERIENCIA", nullable = false)
    private String tipoExperiencia;

    @Column(name = "NOME_EXPERIENCIA", nullable = false)
    private String nomeExperiencia;

    @Column(name = "DATA_EXPERIENCIA", nullable = false)
    private String dataExperiencia;

    @Column(name = "RESUMO_EXPERIENCIA", nullable = false)
    private String resumoExperiencia;

    @Column(name = "REFERENCIA_EXPERIENCIA", nullable = false)
    private String referenciaExperiencia;

    @Column(name = "AVALIACAO_EXPERIENCIA", nullable = false)
    private Long avaliacaoSkill;

    @Column(name = "USER_ID", nullable = false)
    @OneToMany
    private Long USER_ID;







}
