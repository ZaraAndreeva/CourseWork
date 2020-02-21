package com.pet.converter;

import com.pet.dto.UserDTO;
import com.pet.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    public UserDTO incoming(User user){
        return new UserDTO();
    }

    public User ougoing(UserDTO userDTO){
        return new User();
    }

}
