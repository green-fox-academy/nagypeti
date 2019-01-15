package com.gf.foxclub.repository;

import com.gf.foxclub.model.Character;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends CrudRepository<Character, String> {

}
