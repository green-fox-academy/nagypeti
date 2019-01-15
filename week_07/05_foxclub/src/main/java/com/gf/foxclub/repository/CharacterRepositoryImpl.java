package com.gf.foxclub.repository;

import com.gf.foxclub.model.Character;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CharacterRepositoryImpl {

  CharacterRepository characters;

  @Autowired
  CharacterRepositoryImpl(CharacterRepository characters) {
    this.characters = characters;
  }

  public List<Character> getCharacters() {
    List<Character> tempList = new ArrayList<>();
    characters.findAll().forEach(tempList::add);
    return tempList;
  }

  public Character getCharacterBy(String name) {
    return characters.findById(name).orElse(null);
  }

  public void addCharacter(Character character) {
    characters.save(character);
  }

  public void deleteCharacterBy(String name) {
    characters.deleteById(name);
  }



}
