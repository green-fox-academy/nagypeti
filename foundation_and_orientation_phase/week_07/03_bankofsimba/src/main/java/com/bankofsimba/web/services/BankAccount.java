package com.bankofsimba.web.services;

public class BankAccount {

  public enum Currency {ZBR, LN, HYN, ELPHNT, HPP, WRTHG}

  Currency currency;
  String name;
  double balance;
  String animalType;
  boolean isKing;
  boolean isGood;

  public BankAccount(String name, double balance, Currency currency, String animalType, boolean isGood) {
    this.name = name;
    this.balance = balance;
    this.currency = currency;
    this.animalType = animalType;
    this.isKing = false;
    this.isGood = isGood;
  }

  public BankAccount(String name, double balance, Currency currency, String animalType, boolean isGood, boolean isKing) {
    this(name, balance, currency, animalType, isGood);
    this.isKing = isKing;
  }

  public String getName() {
    return name;
  }

  public double getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public Currency getCurrency() {
    return currency;
  }

  public boolean isKing() {
    return isKing;
  }

  public boolean isGood() {
    return isGood;
  }

}
