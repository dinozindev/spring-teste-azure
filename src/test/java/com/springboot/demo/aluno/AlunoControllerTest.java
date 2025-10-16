package com.springboot.demo.aluno;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import org.springframework.http.MediaType;

@WebMvcTest(AlunoController.class)
public class AlunoControllerTest {
  @Autowired
  MockMvc mvc;

  @Test
  public void testGetAllAlunos() throws Exception {
      mvc.perform(get("/alunos"))
          .andExpect(status().isOk())
          .andExpect(content().contentType(MediaType.APPLICATION_JSON))
          .andExpect(jsonPath("$").isArray());
  }

  @Test
  public void testGetAlunoById() {
    assert(true);
  }

  @Test
  public void testGetAlunoByRm() {
    assert(true);
  }

  @Test
  public void testGetAlunoByNome() {
    assert(true);
  }

  @Test
  public void testSaveAluno() {
    assert(true);
  }

  @Test
  public void testDeleteAluno() {
    assert(true);
  }
}
