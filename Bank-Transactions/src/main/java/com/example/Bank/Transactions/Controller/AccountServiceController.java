package com.example.Bank.Transactions.Controller;


import com.example.Bank.Transactions.Model.Account;
import com.example.Bank.Transactions.Model.RequestParam;
import com.example.Bank.Transactions.Repo.AccountRepo;
import com.example.Bank.Transactions.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
    @RequestMapping("/Api")
    public class AccountServiceController {

        public AccountServiceController(AccountRepo accountRepo) {
            this.accountRepo = accountRepo;
            accountRepo.createAccounts();
        }


        @Autowired
        private AccountService accountService;

        @Autowired
        AccountRepo accountRepo;


        @GetMapping("/getBalance")
        public int getbalance() {
            return 200;
        }

        @GetMapping("/getAccounts")
        public List<Account> getAccounts() {
            List<Account> account = accountRepo.getAllProducts();
            return account;
        }

        @RequestMapping(value = "/credit",consumes = MediaType.APPLICATION_JSON_VALUE)
        public String creditAmount(@RequestBody RequestParam requestParam) throws Exception{
            System.out.println("request param "+ requestParam);
            if (!userExists(requestParam))
                return "user not found";
            return accountService.creditAmount(requestParam.getAccountId(),requestParam.getUserId(),requestParam.getAmount());
        }

        private boolean userExists(RequestParam requestParam) {
            return accountService.checkUser(requestParam);
        }


    }

