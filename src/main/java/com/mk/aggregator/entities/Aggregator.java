package com.mk.aggregator.entities;

import java.util.ArrayList;
import java.util.List;

public class Aggregator {

	private User user = new User();
	private List<Order> orders = new ArrayList<>();
	private String host;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	@Override
	public String toString() {
		return "Aggregator [user=" + user + ", orders=" + orders + ", host=" + host + "]";
	}
}
