package com.ambrish.multimodule.application;

import com.ambrish.multimodule.service.Entity.Book;
import com.ambrish.multimodule.service.MyService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;

@SpringBootApplication(scanBasePackages = "com.ambrish.multimodule")
@EntityScan("com.ambrish.multimodule")
@EnableJpaRepositories("com.ambrish.multimodule")
@RestController
public class DemoApplication {

  private final MyService myService;

  public DemoApplication(MyService myService) {

    this.myService = myService;
  }

  @GetMapping("/")
  public String home() {
    return myService.message();
  }

  @GetMapping("/books")
  @ResponseStatus(HttpStatus.OK)
  public ArrayList<Book> getBooks(@RequestParam("id") Integer id) {
    return (ArrayList<Book>) myService.bookRepository.findAllById(Collections.singleton(id));
  }
  @PostMapping("/books")
  @ResponseStatus(HttpStatus.OK)
  public void getBooks(@RequestBody Book book) {
     myService.bookRepository.save(book);
  }


  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }
}
