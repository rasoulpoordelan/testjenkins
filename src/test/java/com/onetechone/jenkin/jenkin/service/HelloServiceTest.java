package com.onetechone.jenkin.jenkin.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class HelloServiceTest {


  @InjectMocks
  private HelloService helloService = new com.onetechone.jenkin.jenkin.service.HelloServiceImpl();

  @Test
  public void testTextSayHello() {

    String expect = helloService.sayHello();
    assertThat(expect).isEqualTo("hello");
  }


}
