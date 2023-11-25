package com.sowmik.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {
    //JPA/Hibernate => Database
    //UserDaoService => Static List
    private static List<User> users = new ArrayList<>();
    private static Integer usersCount = 0;
    static {
        users.add(new User(++usersCount,"Adam", LocalDate.now().minusYears(30)));
        users.add(new User(++usersCount,"Eve", LocalDate.now().minusYears(25)));
        users.add(new User(++usersCount,"David", LocalDate.now().minusYears(22)));
    }
    public List<User> findAll(){
        return users;
    }
    public User save(User user){
        user.setId(++usersCount);
        users.add(user);
        return user;
    }
    public User findOne(int id){
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);

    }
}
