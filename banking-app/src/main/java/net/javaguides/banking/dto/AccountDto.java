package net.javaguides.banking.dto;

import lombok.Data;

@Data
public class AccountDto {
    private Long id;
    private String account_holder_name;
    private double balance;

    public AccountDto(Long id, String account_holder_name, double balance) {
        this.id = id;
        this.account_holder_name = account_holder_name;
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public String getAccount_holder_name() {
        return account_holder_name;
    }

    public double getBalance() {
        return balance;
    }
}
