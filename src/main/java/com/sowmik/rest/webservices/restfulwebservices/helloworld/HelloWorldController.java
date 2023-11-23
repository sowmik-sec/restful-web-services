package com.sowmik.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Rest API
@RestController
public class HelloWorldController {
    // /hello-world

    @GetMapping(path = "hello-world")
    public String helloWorld() {
        return "Hello World";
    }
}
