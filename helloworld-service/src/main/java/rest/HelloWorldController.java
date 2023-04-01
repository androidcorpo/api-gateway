package rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Severin Mbekou <mbekou99@gmail.com>
 */
@RestController
public class HelloWorldController {

  @GetMapping(value = "/helloworld", produces = MediaType.APPLICATION_JSON_VALUE)
  @ResponseStatus(value = HttpStatus.OK)
  public String hello(){
    return "this my endpoint result";
  }
}
