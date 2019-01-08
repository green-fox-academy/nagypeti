package com.trialexam.demo.service;

import com.trialexam.demo.model.Alias;
import org.springframework.stereotype.Service;

@Service
public interface AliasService {

  void addAlias(Alias alias);
  void deleteAlias(Alias alias);

}
