package com.javamaster.service;

import com.javamaster.Controller.dto.FinishPurchaseRequest;

public interface PurchaseService {

    Integer finishPurchase(FinishPurchaseRequest request);

}
