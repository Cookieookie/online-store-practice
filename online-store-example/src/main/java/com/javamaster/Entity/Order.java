package com.javamaster.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "order-table")
@Entity
@Data
public class Order extends AbstractEntity {

    @Column
    private String comment;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    @ManyToOne
    @JoinColumn (name = "purchase_item_id")
    private PurchaseItem purchaseItem;


}
