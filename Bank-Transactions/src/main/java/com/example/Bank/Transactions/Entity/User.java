package com.example.Bank.Transactions.Entity;


import jakarta.persistence.*;

@Entity

@Table(name="users_bank")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private  int user_id;
    private String name;

    public User() {
    }

    //User is parent wrt account
    @ManyToOne(mappedBy ="user",cascade = CascadeType.ALL)
     Account account;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
