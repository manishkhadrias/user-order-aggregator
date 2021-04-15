package com.mk.aggregator.entities;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Order {

	@JsonProperty("id")
	private Integer orderId;
	BigDecimal orderAmount;
	Date orderDate;
	Integer userId;
	String host;

	@JsonProperty("id")
	public Integer getOrderId() {
		return orderId;
	}

	@JsonProperty("id")
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
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
		return "Order [orderId=" + orderId + ", orderAmount=" + orderAmount + ", orderDate=" + orderDate + ", userId="
				+ userId + ", host=" + host + "]";
	}

}
