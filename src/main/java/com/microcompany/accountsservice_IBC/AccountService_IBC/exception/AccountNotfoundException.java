package com.microcompany.accountsservice_IBC.AccountService_IBC.exception;

public class AccountNotfoundException extends GlobalException {
    protected static final long serialVersionUID = 2L;

    public AccountNotfoundException() {
        super("Account not found");
    }

    public AccountNotfoundException(String message) {
        super(message);
    }

    public AccountNotfoundException(Long accountId) {
        super("Account with id: " + accountId + " not found");
    }
}