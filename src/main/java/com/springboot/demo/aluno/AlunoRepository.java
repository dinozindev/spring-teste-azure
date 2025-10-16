package com.springboot.demo.aluno;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    // Custom query methods can be defined here
    Aluno findByRm(String rm);
    Aluno findByNome(String nome);
}
