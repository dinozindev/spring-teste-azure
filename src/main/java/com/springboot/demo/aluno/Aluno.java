package com.springboot.demo.aluno;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "alunos")
public class Aluno {
  @Id
  private Long id;

  @NotNull
  private String nome;

  @NotNull
  private String rm;

  @NotNull
  private String classe;

  public Aluno() {}

  public Aluno(Long id, String nome, String rm, String classe) {
    this.id = id;
    this.nome = nome;
    this.rm = rm;
    this.classe = classe;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getRm() {
    return rm;
  }

  public void setRm(String rm) {
    this.rm = rm;
  }

  public String getClasse() {
    return classe;
  }

  public void setClasse(String classe) {
    this.classe = classe;
  }
}
