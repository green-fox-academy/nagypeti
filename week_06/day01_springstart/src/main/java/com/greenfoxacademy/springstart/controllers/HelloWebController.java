package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

  AtomicLong id = new AtomicLong(1);
  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho",
          "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton",
          "Hei", "Bonjour", "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste",
          "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai",
          "Qanuipit", "Dia dhuit", "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo",
          "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola",
          "Jambo", "Hujambo", "Hej", "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào",
          "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};


  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam(value = "name", defaultValue = "Your name") String name) {
    int getRandomHello = (int) (Math.random() * hellos.length + 0);
    int randomFontSize = (int) (Math.random() * hellos.length + 15);
    int randomRgb1Size = (int) (Math.random() * 255 + 1);
    int randomRgb2Size = (int) (Math.random() * 255 + 1);
    int randomRgb3Size = (int) (Math.random() * 255 + 1);
    model.addAttribute("name", name);
    model.addAttribute("counter", id.addAndGet(1));
    model.addAttribute("hello", hellos[getRandomHello]);
    model.addAttribute("font", randomFontSize);
    model.addAttribute("rgb1", randomFontSize);
    model.addAttribute("rgb2", randomFontSize);
    model.addAttribute("rgb3", randomFontSize);
    return "greeting";
  }

}
