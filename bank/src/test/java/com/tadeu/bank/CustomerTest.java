package com.tadeu.bank;


import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {

    @Test
    public void testCustomerCreation() {
        Account account = new Account(9.66);
        Account teste = new Account(6.5);


        Customer customer = new Customer("Rafaela", "Monteiro", "Rua abc ", account);

        assertEquals("Rafaela", customer.getFirstName());
        assertEquals("Monteiro", customer.getLastName());
        assertEquals("Rua abc ", customer.getAddress());
        assertEquals(account, customer.getAccount());
    }

    @Test
    public void testUpdateCustomerDetails() {
        Account account = new Account(4.0);
        Customer customer = new Customer("Ste", "Silva", "Rua j", account);
        customer.updateCustomerDetails("Ste", "Silva", "Rua j");
        assertEquals("Ste", customer.getFirstName());
        assertEquals("Silva", customer.getLastName());
        assertEquals("Rua j", customer.getAddress());
        assertEquals(account, customer.getAccount());
    }

    @Test
    public void testCustomerDetails() {
        Account account = new Account(8.0);
        Customer customer = new Customer("Maria", "silva", "rua i", account);
        assertEquals("Maria", customer.getFirstName());
        assertEquals("silva", customer.getLastName());
        assertEquals("rua i", customer.getAddress());
        assertEquals(account, customer.getAccount());



    }
}
