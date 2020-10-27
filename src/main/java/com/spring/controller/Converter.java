package com.spring.controller;

import com.spring.model.User;
import com.spring.model.UserRole;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class Converter {

    public String roleSetToString(User user) {
        return user.getRoleSet()
                .stream()
                .map(UserRole::getName)
                .collect(Collectors.joining(", "));
    }
}
