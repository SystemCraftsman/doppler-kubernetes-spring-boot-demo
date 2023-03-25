package com.systemcraftsman.demo.controller;

import com.systemcraftsman.demo.model.PaymentTransaction;
import com.systemcraftsman.demo.repository.PaymentTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaymentTransactionController {

    @Autowired
    private PaymentTransactionRepository repository;

    @GetMapping("/transactions")
    List<PaymentTransaction> findAll() {
        return repository.findAll();
    }

    @PostMapping("/transactions")
    @ResponseStatus(HttpStatus.CREATED)
    PaymentTransaction addTransaction(@RequestBody PaymentTransaction transaction) {
        return repository.save(transaction);
    }
}
