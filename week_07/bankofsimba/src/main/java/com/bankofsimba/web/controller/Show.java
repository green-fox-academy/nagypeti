package com.bankofsimba.web.controller;

import static com.bankofsimba.web.WebApplication.demoBank;

import com.bankofsimba.web.services.BankAccount;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class Show {

  @GetMapping("/showall")
  public String demoAccount(Model model) {
    model.addAttribute("demoBank", demoBank.getAccountList());
    return "show";
  }

  @GetMapping("/add-account")
  public String addAccount() {
    return "/add-account";
  }

  @PostMapping(
          value="/add-account",
          consumes= MediaType.APPLICATION_FORM_URLENCODED_VALUE)
  public String addProduct(@RequestBody MultiValueMap<String, String> formData) {
    BankAccount newAccount = new BankAccount(
            (formData.toSingleValueMap().get("name")),
            Double.parseDouble(formData.toSingleValueMap().get("balance")),
            BankAccount.Currency.LN,
            (formData.toSingleValueMap().get("type")),
            Boolean.parseBoolean(formData.toSingleValueMap().get("isgood")));
    demoBank.getAccountList().add(newAccount);
    return "redirect:/showall";
  }

}
