package br.com.molina.forum.repository;

import br.com.molina.forum.modelo.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository  extends JpaRepository<Curso, Long> {

    Curso findByNome(String nome);
}
