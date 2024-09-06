package com.javamaster.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Table (name = "user-table")
@Entity
@Data
@ToString(exclude = "password")
public class UserEntity extends AbstractEntity {

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;

    @Column
    private String phone;

    @Column
    private String password;

    @Column
    private String address;

    @Column
    @Enumerated(EnumType.STRING)
    private UserRole role;

}

