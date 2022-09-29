package com.djt.service;

import com.djt.domain.User;

import java.util.List;

public interface UserService {
    public User findByPhone(String phone);
    public int add(User user);
}
