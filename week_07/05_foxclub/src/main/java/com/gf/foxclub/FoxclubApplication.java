package com.gf.foxclub;

import com.gf.foxclub.model.Character;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.gf.foxclub.controller.MainController.characters;

@SpringBootApplication
public class FoxclubApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(FoxclubApplication.class, args);
  }

  @Override
  public void run(String... args) {
    characters.addCharacter(new Character("Peter","thor"));
  }
}

