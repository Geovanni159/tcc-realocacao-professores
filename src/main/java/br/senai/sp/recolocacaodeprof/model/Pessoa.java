package br.senai.sp.recolocacaodeprof.model;


import br.senai.sp.recolocacaodeprof.enums.Cargo;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id"
)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
        name = "tipoPessoa",
        length = 1,
        discriminatorType = DiscriminatorType.STRING
)
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique=true)
    private Long id;

    @NotEmpty(message = "O nome deve ser informado")
    private String nome;

    @NotEmpty(message = "O e-mail deve ser informado")
    @Email(message = "O e-mail informado é inválido")
    private String email;

    @NotEmpty(message = "O nome deve ser informado")
    private String telefone;

    private Cargo cargo;




    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "pessoa_id")
    private List<Materia> materias = new ArrayList<Materia>();
    @NotEmpty(message = "O CPF deve ser informado")
    @CPF(message = "O CPF informado é inválido")
    private String cpf;

}
