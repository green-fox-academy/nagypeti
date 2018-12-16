package com.gf.foxclub.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CharacterList {

  List<Character> characters;

  public CharacterList( ) {
    this.characters = new ArrayList<>();
  }

  public void addCharacter(Character c) {
    characters.add(c);
  }

  public Character getCharacter(String name) {
    for (Character c : characters) {
      if (c.getName().equals(name)) {
        return c;
      }
    }
    return null;
  }

}
