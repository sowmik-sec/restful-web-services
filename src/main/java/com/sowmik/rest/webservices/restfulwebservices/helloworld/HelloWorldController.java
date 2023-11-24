package com.sowmik.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Rest API
@RestController
public class HelloWorldController {
    // /hello-world

    @GetMapping(path = "hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping(path = "hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World");
    }

    //Path Parameters
    // /users/{id}/todos/{id} => /users/2/todos/200
    // /hello-world/path-variable/{name}
    // /hello-world/path-variable/sowmik
    @GetMapping(path = "hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello, %s", name));
    }
}
