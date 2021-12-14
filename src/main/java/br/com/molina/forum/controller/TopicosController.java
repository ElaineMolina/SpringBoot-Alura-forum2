package br.com.molina.forum.controller;

import br.com.molina.forum.modelo.Curso;
import br.com.molina.forum.modelo.Topico;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class TopicosController {
    @RequestMapping("/topicos")
    @ResponseBody
    public List<Topico> lista(){
        Topico topico = new Topico("Dúvida", "Dúvida com Spring", new Curso("Sprinig", "Programação"));
        return Arrays.asList(topico, topico, topico);
    }
}
