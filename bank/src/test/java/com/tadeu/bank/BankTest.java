package com.tadeu.bank;

import com.tadeu.bank.model.Bank;
import com.tadeu.bank.model.Customer;
import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankTest {

    @Test
    public void addCostumerTest() {
        Bank objetoBank = new Bank("Santander");
        Account account = new Account(8.0);
        Customer objetoCustomer = new Customer("Maria", "silva", "rua i", account);
        objetoBank.addCustomer(objetoCustomer);

        // testando o metodo getCustumer do objeto objetoBank criado na linha 14
        assertEquals(objetoCustomer, objetoBank.getCustomer(0));
        //testando o metodo getName
        assertEquals("Santander", objetoBank.getName());


    }

    @Test
    public void testGetCustomerList() {
        Account account = new Account(8.0);
        Bank bank = new Bank("Test Bank");
        Customer customer1 = new Customer("Maria", "silva", "rua i", account);
        Customer customer2 = new Customer("Rafa", "silva", "rua i", account);
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);
        List<Customer> customerList = bank.getCustomerList();
        assertEquals(2, customerList.size());
        assertTrue(customerList.contains(customer1));
        assertTrue(customerList.contains(customer2));
        assertEquals(customer1, bank.getCustomer(0));
    }

}
