package com.example.Bank.Transactions.Model;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestParam {
    private String accountId;
    private String userId;
    private float amount;
}
