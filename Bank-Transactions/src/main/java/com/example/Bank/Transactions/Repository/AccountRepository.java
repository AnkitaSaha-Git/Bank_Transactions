package com.example.Bank.Transactions.Repository;


import com.example.Bank.Transactions.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Integer> {

}
