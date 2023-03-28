package com.systemcraftsman.demo.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.Random;

@Entity
public class PaymentTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String owner;

    private BigDecimal amount;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    public PaymentTransaction() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Date getCreateTime() {
        createTime = new Date();
        return createTime;
    }

    public BigDecimal getAmount() {
        amount = new BigDecimal(BigInteger.valueOf(new Random().nextInt(100001)), 2);
        return amount;
    }
}
