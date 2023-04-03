package com.example.Bank.Transactions.Service;

import com.example.Bank.Transactions.Model.RequestParam;
import com.example.Bank.Transactions.Repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {



        @Autowired
        private AccountRepo accountRepo;
        public String creditAmount(String accountId,String userId, float amount) {
            return accountRepo.credit(accountId,userId,amount);
        }

        public boolean checkUser(RequestParam requestParam) {
            return accountRepo.checkUser(requestParam);
        }
    }

