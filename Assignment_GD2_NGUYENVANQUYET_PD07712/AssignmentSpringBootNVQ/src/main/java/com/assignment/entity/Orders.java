package com.assignment.entity;

import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


import java.util.Date;

@Data
@Entity
@Table(name = "orders")
public class Orders {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
    
    @Temporal(TemporalType.DATE)
    private Date orderDate;
    
    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;
    
    private Float amount;
    
    private Integer status;
}
