package com.tadeu.bank.controller;

import com.tadeu.bank.Account;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bank")
public class BankController {
    Account account = new Account(10);

    @PutMapping
    public ResponseEntity<String> saqueController(@RequestParam double valor) {
        if (account.withdraw(valor)) {
            return new ResponseEntity<>("Saque realizado com sucesso!", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Dinheiro não disponivel!", HttpStatus.BAD_REQUEST);
        }

    }

    @PostMapping
    public ResponseEntity<String> depositoController(@RequestParam double valor) {
        account.deposit(valor);
        return new ResponseEntity<>("Deposito realizado com sucesso!", HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<String> saldoController() {

        return new ResponseEntity<>("Saldo disponivel em conta:" + account.getBalance(), HttpStatus.OK);
    }
}
