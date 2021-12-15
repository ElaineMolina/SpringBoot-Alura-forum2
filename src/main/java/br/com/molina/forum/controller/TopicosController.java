package br.com.molina.forum.controller;

import br.com.molina.forum.controller.dto.TopicoDto;
import br.com.molina.forum.modelo.Curso;
import br.com.molina.forum.modelo.Topico;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @RequestMapping("/topicos")
    public List<TopicoDto> lista(){
        Topico topico = new Topico("Dúvida", "Dúvida com Spring", new Curso("Sprinig", "Programação"));

        return TopicoDto.converter(Arrays.asList(topico, topico, topico));
    }
}
