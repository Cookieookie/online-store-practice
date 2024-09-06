package com.javamaster.service;


import com.javamaster.Entity.UserEntity;
import com.javamaster.repository.UserEntityRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static com.javamaster.Entity.UserRole.CUSTOMER;
import static java.util.Objects.nonNull;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserEntityRepository userEntityRepository;

    @Override
    public UserEntity findOrCreateUser(String firstName, String lastName,
                                       String phone, String email,
                                       String address) {
       UserEntity userEntity = userEntityRepository.findByEmail((email));
       if(nonNull(userEntity)) {
           return userEntity;
       }
       userEntity = new userEntity();
       userEntity.setRole(CUSTOMER.name());
       userEntity.setAddress(address);
       userEntity.setFirstName(firstName);
       userEntity.setLastName(lastName);
       userEntity.setPhone(phone);
       userEntity.setEmail(email);
        return userEntityRepository.save(userEntity);
    }
}
