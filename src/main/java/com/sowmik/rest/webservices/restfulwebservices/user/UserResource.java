package com.sowmik.rest.webservices.restfulwebservices.user;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {


    private UserDaoService service;

    public UserResource(UserDaoService service) {
        this.service = service;
    }

    // GET /users
    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return service.findAll();
    }

    // GET /users/id
    @GetMapping("/users/{id}")
    public User retrieveSingleUser(@PathVariable Integer id) {
        return service.findOne(id);
    }

    //POST /users
    @PostMapping("/users")
    public void createUser(@RequestBody User user) {
        service.save(user);
    }
}
