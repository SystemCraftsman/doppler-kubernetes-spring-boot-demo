package com.systemcraftsman.demo.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class PaymentTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String owner;

    @Basic(optional = false)
    @Column(name = "CreateTime", insertable = false, updatable = false)
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
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
