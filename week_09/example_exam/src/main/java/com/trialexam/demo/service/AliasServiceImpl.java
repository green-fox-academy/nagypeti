package com.trialexam.demo.service;

import com.trialexam.demo.model.Alias;
import com.trialexam.demo.repository.AliasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.trialexam.demo.service.RandomGen.randFourDigitLong;

@Service
public class AliasServiceImpl implements AliasService {

  @Autowired
  AliasRepository aliasRepository;

  @Override
  public void addAlias(Alias alias) {
    alias.setSecretCode(randFourDigitLong());
    aliasRepository.save(alias);
  }

  @Override
  public void deleteAlias(Alias alias) {
    aliasRepository.delete(alias);
  }

  public boolean existsAliasByAliasName(String aliasName) {
    return aliasRepository.existsAliasByAliasName(aliasName);
  }

  public Alias findAliasByName(String aliasName) {
    return aliasRepository.findAliasByAliasName(aliasName);
  }

  public Alias findById(Long id) {
    return aliasRepository.findById(id).orElse(null);
  }

  public void incHitCount(String aliasName) {
    aliasRepository.incHitCount(aliasRepository.findAliasByAliasName(aliasName).getId());
  }
}
