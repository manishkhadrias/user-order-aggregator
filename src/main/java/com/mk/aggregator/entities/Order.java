package com.mk.aggregator.entities;

import java.math.BigDecimal;
import java.util.Date;

public class Order {

	private Integer id;
	private BigDecimal orderAmount;
	private Date orderDate;
	private Integer userId;
	private String host;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderAmount=" + orderAmount + ", orderDate=" + orderDate + ", userId=" + userId
				+ ", host=" + host + "]";
	}
	
}