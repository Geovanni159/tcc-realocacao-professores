package br.senai.sp.recolocacaodeprof.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/aluno")
public class AlunoController {
    @GetMapping("/listagem")
    public String listagem(){
        return "aluno/listagem";
    }
}
