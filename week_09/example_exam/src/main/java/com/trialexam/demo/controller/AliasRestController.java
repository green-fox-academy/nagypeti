package com.trialexam.demo.controller;

import com.trialexam.demo.model.AliasDto;
import com.trialexam.demo.service.AliasServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AliasRestController {

  @Autowired
  AliasServiceImpl aliasService;

  @GetMapping("/api/links")
  public List<AliasDto> aliasDtoList() {
    return aliasService.aliasDtos();
  }
}
