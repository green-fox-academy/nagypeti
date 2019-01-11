package com.greenfox.exam.controller;

import com.greenfox.exam.model.Order;
import com.greenfox.exam.service.OrderServiceImpl;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class OrderController {

  private OrderServiceImpl service;

  @Autowired
  public OrderController(OrderServiceImpl service) {
    this.service = service;
  }

  @GetMapping("/")
  public String orderPage(Model model) {
    model.addAttribute("order", new Order());
    return "index";
  }

  @PostMapping("/order")
  public String saveOrder(Order order, RedirectAttributes redir) {
    service.addOrder(order);
    redir.addAttribute("id", order.getId());
    return "rediect:/order/{id}";
  }

  @GetMapping("/order/{id}")
  public String orderInfo(@PathVariable("id") Long id, Model model) {
    model.addAttribute("order", service.orderById(id));
    return "order-accepted";
  }

}
