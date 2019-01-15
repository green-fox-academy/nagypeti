package com.trialexam.demo.controller;

import com.trialexam.demo.model.Alias;
import com.trialexam.demo.model.AliasDto;
import com.trialexam.demo.service.AliasServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AliasRestController {

  @Autowired
  AliasServiceImpl aliasService;

  @GetMapping("/api/links")
  public List<AliasDto> aliasDtoList() {
    return aliasService.aliasDtos();
  }

  @DeleteMapping("/api/links/{id}")
  public ResponseEntity<Object> deleteAlias(@RequestBody Alias alias,
                                            @PathVariable long id) {
    if (aliasService.findById(id).getSecretCode() == alias.getSecretCode()) {
      aliasService.deleteById(id);
      return new ResponseEntity(HttpStatus.NO_CONTENT);
    } else if (aliasService.findById(id).getSecretCode() != alias.getSecretCode()) {
      return new ResponseEntity(HttpStatus.FORBIDDEN);
    } else {
      return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
  }

}
