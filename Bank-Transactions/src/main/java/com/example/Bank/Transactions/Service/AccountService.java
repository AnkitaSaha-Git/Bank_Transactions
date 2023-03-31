package com.example.Bank.Transactions.Service;


import com.example.Bank.Transactions.Entity.Account;

public class AccountService {

    public String credit(Account account) throws Exception {
        if (account.getBalance() > 100000000) {
            throw new Exception("Account balance cannot go beyond 100000000")
        } else {

        }
    }
}
