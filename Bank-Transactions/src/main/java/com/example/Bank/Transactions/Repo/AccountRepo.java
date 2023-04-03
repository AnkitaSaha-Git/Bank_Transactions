package com.example.Bank.Transactions.Repo;


import com.example.Bank.Transactions.Model.Account;
import com.example.Bank.Transactions.Model.RequestParam;
import com.example.Bank.Transactions.Model.Users;
import org.apache.logging.log4j.message.StringFormattedMessage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class AccountRepo {
    private List<Account> accounts = new ArrayList<Account>();


    public void createAccounts() {


        accounts = List.of(
                new Account("1", 100F, List.of(new Users("11", "test"))),
                new Account("2", 200.00F, List.of(new Users("22", "ravi")))
        );
    }

    public List<Account> getAllProducts() {
        return accounts;
    }

    public String credit(String accountId, String userId, float amount) {
        System.out.println(accounts);
        accounts.stream().filter(account -> checkuserId(account.getUsers(),userId))
                .map(account -> {account.setBalance(account.getBalance() + amount); return account; })
                .collect(Collectors.toList());

        return "Balance Updated";
    }

    private boolean checkuserId(List<Users> users, String userId) {
        List list =users.stream().map(users1 -> users1.getId()).collect(Collectors.toList());
        if (list.contains(userId)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkUser(RequestParam requestParam) {
        String accountId = requestParam.getAccountId();
        String userId = requestParam.getUserId();
        List<Account> list = accounts.stream().filter(res -> accountId.equals(res.getId()))
                .filter(resp -> checkuserId(resp.getUsers(),userId))
                .collect(Collectors.toList());

        if (list.size()>0) return true;
        else return false;

    }
}
