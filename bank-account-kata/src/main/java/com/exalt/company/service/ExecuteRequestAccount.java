package com.exalt.company.service;

import java.util.List;

import com.exalt.company.dto.AccountDto;

public interface ExecuteRequestAccount {
    AccountDto modifyBalanceOperation(AccountDto account);
    <T> AccountDto getAccountByType(T type);
    List<AccountDto> getAllAccountStatements();
}
