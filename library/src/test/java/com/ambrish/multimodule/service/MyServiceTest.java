package com.ambrish.multimodule.service;

import static org.assertj.core.api.Assertions.assertThat;

import com.ambrish.multimodule.service.repository.BookRepository;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;

@SpringBootTest("service.message=Ambrish")
public class MyServiceTest {

  @Autowired
  private MyService myService;
@Autowired
  BookRepository bookRepository;
  @Test
  public void contextLoads() {
    assertThat(myService.message()).isNotNull();
  }

  @Test
  public void dbConnection(){assertThat(bookRepository.findAllById(Collections.singleton(1))).isNotEmpty();}

  @SpringBootApplication
  static class TestConfiguration {
  }

}
