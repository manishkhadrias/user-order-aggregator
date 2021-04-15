package com.mk.aggregator.entities;

import java.util.ArrayList;
import java.util.List;

public class Aggregator {

	User user = new User();

	List<Order> order = new ArrayList<>();

	String host;

	public User getUserBean() {
		return user;
	}

	public void setUserBean(User user) {
		this.user = user;
	}

	public List<Order> getOrderBean() {
		return order;
	}

	public void setOrderBean(List<Order> order) {
		this.order = order;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	@Override
	public String toString() {
		return "Aggregator [userBean=" + user + ", orderBean=" + order + ", host=" + host + "]";
	}

}
