package com.onetechone.jenkin.jenkin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  @GetMapping
  public String hello()
  {
    return "hello medrick its ok";
  }

}
