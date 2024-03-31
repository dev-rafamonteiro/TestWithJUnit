package com.tadeu.bank;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CheckingAccountTest {

    @Test
    public void testDeposit1() {
        CheckingAccount account = new CheckingAccount(1000.0, 500.0);
        account.deposit(200.0);
        assertEquals(1700.0, account.getBalance(), 0.01);
        assertEquals(500.0, account.getCurrentLimit(), 0.01);

        account.deposit(600.0);
        assertEquals(2300.0, account.getBalance(), 0.01);
        assertEquals(500.0, account.getCurrentLimit(), 0.01);

        account.deposit(400.0);
        assertEquals(2700.0, account.getBalance(), 0.01);
        assertEquals(500.0, account.getCurrentLimit(), 0.01);
    }

    @Test
    public void testDepositErrorInCode() {
        // caso de erro
        double initialBalance = 100.0;
        double totalLimit = 500.0;
        CheckingAccount account = new CheckingAccount(initialBalance, totalLimit);

        double depositAmount = 200.0;
        account.deposit(depositAmount);

        assertEquals(initialBalance + depositAmount, account.getBalance(), 0.001);

        initialBalance = account.getBalance();
        depositAmount = 600.0;
        account.deposit(depositAmount);
        assertEquals(initialBalance + totalLimit, account.getBalance(), 0.001);

    }

    @Test
    public void testWithdraw() {
        CheckingAccount account = new CheckingAccount(1000.0, 500.0);
        assertTrue(account.withdraw(700.0));
        assertEquals(800.0, account.getBalance(), 0.01);
        assertEquals(500.0, account.getCurrentLimit(), 0.01);

        assertTrue(account.withdraw(400.0));
        assertEquals(200.0, account.getBalance(), 0.01);
        assertEquals(200.0, account.getCurrentLimit(), 0.01);

        assertFalse(account.withdraw(800.0));
        assertEquals(200.0, account.getBalance(), 0.01);
        assertEquals(200.0, account.getCurrentLimit(), 0.01);

        assertTrue(account.withdraw(100.0));
        assertEquals(200.0, account.getBalance(), 0.01);
        assertEquals(200.0, account.getCurrentLimit(), 0.01);
    }
}
