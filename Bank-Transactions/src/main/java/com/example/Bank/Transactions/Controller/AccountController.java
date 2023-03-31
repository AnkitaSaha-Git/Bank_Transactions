package com.example.Bank.Transactions.Controller;


import com.example.Bank.Transactions.Entity.Account;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    @PostMapping("/credit")
    public ResponseEntity<String> credit(Account account){

    }

}
