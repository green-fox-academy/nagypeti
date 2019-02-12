package com.guardians.ofthegalaxy.controller;

import com.guardians.ofthegalaxy.Error;
import com.guardians.ofthegalaxy.model.Groot;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/groot")
public class GuardianController {

  @GetMapping
  public ResponseEntity<Object> grootTranslator(@RequestParam(required = false) String message) {
    if (message == null || message.equals("")) {
      return new ResponseEntity(new Error("I am Groot!"), HttpStatus.BAD_REQUEST);
    }
    return new ResponseEntity(new Groot(message), HttpStatus.OK);
  }

}
