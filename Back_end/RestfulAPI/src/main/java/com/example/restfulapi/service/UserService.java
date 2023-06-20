package com.example.restfulapi.service;

import com.example.restfulapi.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    public List<User> userList;

    public UserService(){
        userList = new ArrayList<>();
        User user1 = new User(1,"jack",10,"jack@gmail.com");
        User user2 = new User(2,"john",10,"john@gmail.com");
        User user3 = new User(3,"lili",10,"lili@gmail.com");
        User user4 = new User(4,"mono",10,"mono@gmail.com");
        User user5 = new User(5,"hoho",10,"hoho@gmail.com");
        userList.addAll(Arrays.asList(user1,user2,user3,user4,user5));
    }
    public Optional<User> getUser(Integer id) {
        Optional optional = Optional.empty();
        for (User user : userList) {
            if (id == user.getId()){
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }

}
