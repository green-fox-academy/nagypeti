package com.dependecies.exercises.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedColor implements MyColor {

  Printer printer;

  @Autowired
  RedColor(Printer printer) {
    this.printer = printer;
  }

  @Override
  public void printColor() {
    printer.log("It is red in color...");
  }

}
