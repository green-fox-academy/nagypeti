package com.bankofsimba.web.services;

import java.util.ArrayList;
import java.util.List;

import static com.bankofsimba.web.services.BankAccount.Currency.*;

public class AccountList {

  List<BankAccount> accountList;

  public AccountList() {
    accountList = new ArrayList<>();
    fillDemoAccounts();
  }

  public void fillDemoAccounts() {
    accountList.add(new BankAccount("Simba", 2000, LN, "lion",true));
    accountList.add(new BankAccount("Mufasa", 677899765, LN, "lion", true, true));
    accountList.add(new BankAccount("Pumba", 80000, WRTHG, "warthog", true));
    accountList.add(new BankAccount("Timon", 150, WRTHG, "meercat", true));
    accountList.add(new BankAccount("Rafiki ", 0, LN, "baboon", true));
    accountList.add(new BankAccount("Scar ", 345673, LN, "lion", false));
  }

  public List<BankAccount> getAccountList() {
    return accountList;
  }

}
