package com.sowmik.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {
    //JPA/Hibernate => Database
    //UserDaoService => Static List
    private static List<User> users = new ArrayList<>();
    static {
        users.add(new User(1,"Adam", LocalDate.now().minusYears(30)));
        users.add(new User(2,"Eve", LocalDate.now().minusYears(25)));
        users.add(new User(1,"David", LocalDate.now().minusYears(22)));
    }
    public List<User> findAll(){
        return users;
    }
    //public User save(User user){}
    //public User findOne(int id){}
}
