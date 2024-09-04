package com.javamaster.Controller.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Map;

@Data
public class FinishPurchaseRequest {


    @NotNull
    private Map<Integer, Integer> productIdProductCount;

    @NotEmpty
    private String userFirstName;

    private String userLastName;
    @NotEmpty
    private String address;
    @NotEmpty
    private String email;
    @NotEmpty
    private String phone;

    private String comment;

}
