package com.Courier.CourierService.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class PaymentDetailes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int paymentid;

	private String paymentType;
	private double price;


	

	public PaymentDetailes() {
		
	}

	
	public PaymentDetailes(int paymentid, String paymentType, double price) {
		super();
		this.paymentid = paymentid;
		this.paymentType = paymentType;
		this.price = price;
		
	}


	public int getPaymentid() {
		return paymentid;
	}

	public void setPaymentid(int paymentid) {
		this.paymentid = paymentid;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}



	
}
