package br.senai.sp.recolocacaodeprof.model;


import jakarta.persistence.*;

@Entity
// F de funcionario
@DiscriminatorValue(value = "F")
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique=true)
    private Long id;
}
