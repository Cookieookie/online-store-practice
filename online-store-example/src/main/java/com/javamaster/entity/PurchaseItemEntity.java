package com.javamaster.Entity;


import jakarta.persistence.*;
import lombok.Data;

@Table(name = "purchase_item_table")
@Entity
@Data
public class PurchaseItemEntity extends AbstractEntity {

    @Column
    private Integer count;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductEntity productEntity;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderEntity orderEntity;


}
