package com.exalt.company.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountDto {
    private String operation;
    private LocalDateTime date;
    private double amount;
    private double balance;
}
