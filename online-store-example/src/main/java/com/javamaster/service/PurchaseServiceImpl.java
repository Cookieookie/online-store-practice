package com.javamaster.Service;

import com.javamaster.Controller.dto.FinishPurchaseRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PurchaseServiceImpl implements PurchaseService {

    @Override
    public Integer finishPurchase(FinishPurchaseRequest request) {
        return null;
    }


}
