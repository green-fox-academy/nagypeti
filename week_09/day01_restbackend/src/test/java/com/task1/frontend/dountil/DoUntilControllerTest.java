package com.task1.frontend.dountil;

import com.task1.frontend.log.LogServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(DoUntilController.class)
public class DoUntilControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  DoUntilService service;
  @MockBean
  LogServiceImpl logService;

  @Test
  public void doUntilSumEndpointPostTest() throws Exception{
    this.mockMvc.perform(post("/dountil/sum").content("{\"until\": 5}").contentType(MediaType.APPLICATION_JSON))
            .andExpect(jsonPath("$.result",is(15)))
            .andExpect(status().isOk());
  }

  @Test
  public void doUntilFactorEndpointPostTest() throws Exception{
    this.mockMvc.perform(post("/dountil/factor").content("{\"until\": 5}").contentType(MediaType.APPLICATION_JSON))
            .andExpect(jsonPath("$.result",is(120)))
            .andExpect(status().isOk());
  }

}
