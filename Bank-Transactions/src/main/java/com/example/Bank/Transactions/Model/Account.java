package com.example.Bank.Transactions.Model;

import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private String id;
    private float balance;
    private List<Users> users;
}
