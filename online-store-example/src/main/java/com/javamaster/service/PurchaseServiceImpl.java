package com.javamaster.service;

import com.javamaster.Controller.dto.FinishPurchaseRequest;
import com.javamaster.Entity.OrderEntity;
import com.javamaster.Entity.ProductEntity;
import com.javamaster.Entity.PurchaseItemEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PurchaseServiceImpl implements PurchaseService {

    private final ProductService productService;
    @Override
    public Integer finishPurchase(FinishPurchaseRequest request) {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setUserEntity();
        orderEntity.setComment(request.getComment());
        request.getProductIdProductCount().forEach((k,v) -> {
            ProductEntity productEntity = productService.findById(k);
            PurchaseItemEntity p = new PurchaseItemEntity();
            p.setProductEntity(productEntity);
            p.setCount(v);
            p.setOrderEntity();
        });
        return null;
    }


}
