package com.exalt.company.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OperationAccountReaderService {
    private final RequestManagementAccount requestOperationAccount;

    public double retrieveMoney(double amount) {
        return requestOperationAccount.retrieveSavings(amount);
    }

    public double depositMoney(double amount) {
        return requestOperationAccount.saveMoney(amount);
    }
    
    public void checkOperations() {
        requestOperationAccount.checkOperations();
    }
}
