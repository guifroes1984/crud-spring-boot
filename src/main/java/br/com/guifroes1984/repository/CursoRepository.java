package br.com.guifroes1984.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.guifroes1984.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

}
