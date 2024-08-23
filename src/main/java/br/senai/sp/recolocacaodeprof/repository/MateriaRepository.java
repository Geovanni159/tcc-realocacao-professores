package br.senai.sp.recolocacaodeprof.repository;

import br.senai.sp.recolocacaodeprof.model.Materia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MateriaRepository extends JpaRepository<Materia, Long> {
}
