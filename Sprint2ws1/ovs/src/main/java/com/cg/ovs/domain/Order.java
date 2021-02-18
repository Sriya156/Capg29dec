//package com.cg.ovs.domain;
//package com.cg.ovs.domain;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
////import javax.validation.constraints.NotBlank;
//import com.fasterxml.jackson.annotation.JsonFormat;
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//@Entity
//public class Order 
//{
//	@Id
//	@Column(name="order_id")
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	private Long orderId;
//	private int orderNo;
//	private String totalAmount;
//	@JsonFormat(pattern = "yyyy-MM-dd")
//	private String orderDate;
//	private String status;
//	
//	@OneToOne(fetch = FetchType.EAGER)
//	@JoinColumn(name="paymentid", nullable = false)
//	@JsonIgnore
//	private Payment payment;
//	public Long getOrderId() {
//		return orderId;
//	}
//	public void setOrderId(Long orderId) {
//		this.orderId = orderId;
//	}
//	public int getOrderNo() {
//		return orderNo;
//	}
//	public void setOrderNo(int orderNo) {
//		this.orderNo = orderNo;
//	}
//	public String getTotalAmount() {
//		return totalAmount;
//	}
//	public void setTotalAmount(String totalAmount) {
//		this.totalAmount = totalAmount;
//	}
//	public String getOrderDate() {
//		return orderDate;
//	}
//	public void setOrderDate(String orderDate) {
//		this.orderDate = orderDate;
//	}
//	public String getStatus() {
//		return status;
//	}
//	public void setStatus(String status) {
//		this.status = status;
//	}
//	public Payment getPayment() {
//		return payment;
//	}
//	public void setPayment(Payment payment) {
//		this.payment = payment;
//	}
//}
