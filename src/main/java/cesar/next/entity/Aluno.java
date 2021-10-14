package cesar.next.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ALUNOS")
public class Aluno implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "CPF", nullable = false, unique = true)
    private String cpf;

    @Column(name = "NOME", nullable = false)
    private String nome;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Column(name = "LINGUA", nullable = false)
    private String lingPrincipal;

    @Column(name = "DEF", nullable = false)
    private String def;

    @Column(name = "PASS", nullable = false)
    private String pass;

    @Column(name = "TELEFONE", nullable = false)
    private String telef;

    @Column(name = "DATANASC", nullable = false)
    private String dataNas;

    @Column(name = "ENDERECOCEP", nullable = false)
    private String endCep;

    @Column(name = "ENDNUMERO", nullable = false)
    private Integer endNum;
}

