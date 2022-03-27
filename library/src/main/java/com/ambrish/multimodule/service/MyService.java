package com.ambrish.multimodule.service;

import com.ambrish.multimodule.service.repository.BookRepository;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@EnableConfigurationProperties(ServiceProperties.class)
public class MyService {

  private final ServiceProperties serviceProperties;
public  final BookRepository bookRepository;
  public MyService(ServiceProperties serviceProperties, BookRepository bookRepository) {
    this.bookRepository = bookRepository;
    this.serviceProperties = serviceProperties;
  }

  public String message() {
    return this.serviceProperties.getMessage();
  }

}
