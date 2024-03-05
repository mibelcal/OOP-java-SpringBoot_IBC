package com.microcompany.accountsservice_IBC.AccountService_IBC.persistence;


import com.microcompany.accountsservice_IBC.AccountService_IBC.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface AccountRepository extends JpaRepository<Account, Long> {
    List<Account> findByOwnerId(Long OwnerId);

}
