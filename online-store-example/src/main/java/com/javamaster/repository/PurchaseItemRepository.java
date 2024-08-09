package com.javamaster.repository;

import com.javamaster.Entity.PurchaseItem;
import com.javamaster.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseItemRepository extends JpaRepository<PurchaseItem, Integer> {


}
