package br.senai.sp.recolocacaodeprof.repository;

import br.senai.sp.recolocacaodeprof.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
