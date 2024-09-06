package com.javamaster.service;

import com.javamaster.Entity.UserEntity;

public interface UserService {

    UserEntity findOrCreateUser(String firstName,
                                String lastName,
                                String phone,
                                String email,
                                String address);
}
