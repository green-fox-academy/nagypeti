package com.guardians.ofthegalaxy.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
public class GuardianControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void grootTranslator_testStatusOk() throws Exception{
    this.mockMvc.perform(get("/groot").param("message", "asd"))
            .andExpect(jsonPath("$.received",is("asd")))
            .andExpect(jsonPath("$.translated",is("I am Groot!")))
            .andExpect(status().isOk());
  }

  @Test
  public void grootTranslator_testBadRequest() throws Exception{
    this.mockMvc.perform(get("/groot").param("message", ""))
            .andExpect(jsonPath("$.error",is("I am Groot!")))
            .andExpect(status().isBadRequest());
  }

}
