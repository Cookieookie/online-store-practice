package com.javamaster.repository;

import com.javamaster.Entity.PurchaseItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseItemRepository extends JpaRepository<PurchaseItemEntity, Integer> {


}
