package com.javamaster.Entity;


import jakarta.persistence.*;
import lombok.Data;

@Table(name = "purchase_item_table")
@Entity
@Data
public class PurchaseItem extends AbstractEntity {

    @Column
    private Integer count;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;


}
