package com.systemcraftsman.demo.repository;

import com.systemcraftsman.demo.model.PaymentTransaction;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PaymentTransactionRepository extends CrudRepository<PaymentTransaction, Long> {
    List<PaymentTransaction> findAll();
}
