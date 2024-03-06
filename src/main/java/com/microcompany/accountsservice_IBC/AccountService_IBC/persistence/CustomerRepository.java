package com.microcompany.accountsservice_IBC.AccountService_IBC.persistence;


import com.microcompany.accountsservice_IBC.AccountService_IBC.model.Account;
import com.microcompany.accountsservice_IBC.AccountService_IBC.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
