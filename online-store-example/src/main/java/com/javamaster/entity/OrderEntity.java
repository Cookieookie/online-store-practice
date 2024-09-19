package com.javamaster.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "order-table")
@Entity
@Data
public class OrderEntity extends AbstractEntity {

    @Column
    private String comment;

    @ManyToOne
    @JoinColumn(name = "user_id")
    UserEntity userEntity;

}
