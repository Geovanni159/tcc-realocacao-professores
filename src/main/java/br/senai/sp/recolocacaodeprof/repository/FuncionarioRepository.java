package br.senai.sp.recolocacaodeprof.repository;

import br.senai.sp.recolocacaodeprof.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
