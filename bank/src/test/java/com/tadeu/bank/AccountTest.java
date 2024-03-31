package com.tadeu.bank;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void testAccountDeposit(){
        Account account = new Account(2.0);
        account.deposit(1.0);
        assertEquals(account.getBalance(), 3.0);
    }

    @Test
    public void testAccountWithdraw(){
        Account account = new Account(5.0);
        account.withdraw(1.0);
        assertEquals(account.withdraw(1.0), true);
    }


}
