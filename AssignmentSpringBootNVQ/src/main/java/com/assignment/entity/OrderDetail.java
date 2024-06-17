package com.assignment.entity;

import lombok.Data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Data
@Entity
@Table(name = "orderDetail")
public class OrderDetail {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderDetailId;
    
    @ManyToOne
    @JoinColumn(name = "orderId")
    private Orders order;
    
    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;
    
    private Integer quantity;
    
    private Float unitPrice;
    

	@Transient
	Float subTotal = quantity*unitPrice;


//	public OrderDetail(Float subTotal) {
//		super();
//		this.subTotal = quantity * unitPrice;
//	}
//
//	public Float getSubTotal() {
//		subTotal = unitPrice * quantity;
//		return subTotal;
//	}
	

}
