package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    //fake user list
    List<User> list = List.of(
            new User(1001L, "Ashikur", "01720"),
            new User(1002L, "Rahman", "01725"),
            new User(1003L, "Rashid", "01727")
    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
