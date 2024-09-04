package com.javamaster.Service;

import com.javamaster.Controller.dto.FinishPurchaseRequest;

public interface PurchaseService {

    Integer finishPurchase(FinishPurchaseRequest request);

}
