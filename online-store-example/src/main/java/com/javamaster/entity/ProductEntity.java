package com.javamaster.Entity;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Table(name = "product_table")
@Entity
@Data
public class ProductEntity extends AbstractEntity {

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private String image;

    @Column
    private BigDecimal price;




}
