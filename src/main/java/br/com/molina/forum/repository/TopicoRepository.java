package br.com.molina.forum.repository;

import br.com.molina.forum.modelo.Topico;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TopicoRepository extends JpaRepository<Topico, Long> {


    Page<Topico> findByCursoNome(String nomeCurso, Pageable paginacao);
}
