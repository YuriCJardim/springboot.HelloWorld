package com.hello.hello;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  
   @GetMapping
    public List <String> getHelloWorld (){


        return List.of("Hello", "World" );
    }
    
}
