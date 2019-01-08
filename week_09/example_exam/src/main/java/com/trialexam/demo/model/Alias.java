package com.trialexam.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alias {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  @GeneratedValue
  private long secretCode;
  private String url;
  private String aliasName;
  private long hitCount;

  public Alias() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getAliasName() {
    return aliasName;
  }

  public void setAliasName(String aliasName) {
    this.aliasName = aliasName;
  }

  public long getHitCount() {
    return hitCount;
  }

  public void setHitCount(int hitCount) {
    this.hitCount = hitCount;
  }

  public long getSecretCode() {
    return secretCode;
  }

  public void setSecretCode(long secretCode) {
    this.secretCode = secretCode;
  }
}
