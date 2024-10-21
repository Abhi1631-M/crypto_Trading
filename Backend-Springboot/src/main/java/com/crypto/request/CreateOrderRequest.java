package com.crypto.request;

import lombok.Data;

import java.math.BigDecimal;

import com.crypto.domain.OrderType;
import com.crypto.model.Coin;


@Data
public class CreateOrderRequest {
    private String coinId;
    private double quantity;
    private OrderType orderType;
}
