package com.onetechone.jenkin.jenkin.controller;

import com.onetechone.jenkin.jenkin.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  @Autowired
  HelloService helloService;

  @GetMapping
  public String hello()
  {
    return helloService.sayHello();
  }

}
