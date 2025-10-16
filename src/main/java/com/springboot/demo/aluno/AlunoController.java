package com.springboot.demo.aluno;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/alunos")
public class AlunoController {
    // Controller methods would go here
    @GetMapping
    public List<Aluno> getAllAlunos(@RequestParam(required = false) String nome) {
        // This is a placeholder implementation
        return List.of(new Aluno(1L, "João", "12345", "10A"));
    }

}
