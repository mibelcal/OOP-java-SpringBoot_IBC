package com.microcompany.accountsservice_IBC.AccountService_IBC.services;

import com.microcompany.accountsservice_IBC.AccountService_IBC.model.Account;
import com.microcompany.accountsservice_IBC.AccountService_IBC.model.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Instant;
import java.util.Date;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class AccountServiceTest {

    @Autowired
    private IAccountService service;

    @Test
    void create() {
        Account newAcc = new Account(null, "Naranja", Date.from(Instant.now()), 1000, 1L, new Customer(null, "Pilar", "Pilar@hotmail.com", null));

        service.create(newAcc);
        Account aAccount = service.getAccount(newAcc.getId());

        assertEquals(aAccount.getId(), newAcc.getId());
    }


}