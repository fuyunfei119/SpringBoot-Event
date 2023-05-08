package com.example.eventpublisher.Entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@Data
@Accessors(chain = true)
public class Customer {
    private String id;
    private String userName;
    private String password;
    private double balance;
}
