package com.androidcorpo.helloworldservice.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Severin Mbekou <mbekou99@gmail.com>
 */
@RestController
public class HelloWorldController {

  @GetMapping(value = "/helloworld", produces = MediaType.APPLICATION_JSON_VALUE)
  public String hello(){
    return "this my endpoint result";
  }
}
