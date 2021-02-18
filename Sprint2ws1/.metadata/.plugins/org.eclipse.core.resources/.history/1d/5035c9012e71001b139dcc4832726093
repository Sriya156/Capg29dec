package com.cg.ovs.domain;
//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name="payments")
public class Payment 
{
	@Id
	@Column(name="payment_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int paymentId;
	@NotBlank(message = "Payment Mode Required")
	@Pattern(regexp="^[a-zA-Z\\s]+$",message="must have only characters")
	private String paymentMode;
	@NotBlank(message = "Bank Name Required")
	@Pattern(regexp="^[a-zA-Z\\s]+$",message="must have only characters")
	private String bankName;
	@NotBlank(message = "Customer Name Required")
	@Pattern(regexp="^[a-zA-Z\\s]+$",message="must have only characters")
	private String customerName;
	@Pattern(regexp="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",message="Minimum eight characters, at least one uppercase letter, one lowercase letter, one number and one special character")
	private String password;
	@Pattern(regexp="^[0-9]{12}$",message="must have only 12 digits")
	private String accountNumber;
	@Pattern(regexp="^[0-9]{16}$",message="must have only 16 digits")
	private String cardNumber;
	@Pattern(regexp="^[0-9]{3}$",message="must have only 3 digits")
	private String cvv;
	@Pattern(regexp="^(1[0-2]|0[1-9])/[0-9]{2}$",message="should be in format of mm/yy and the month should be below or equal to 12")
	private String expiryDate;
	private String status;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private String transactionDate;
	
//	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "order")
//	private Order order;
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
//	public Order getOrder() {
//		return order;
//	}
//	public void setOrder(Order order) {
//		this.order = order;
//	}
//	
}