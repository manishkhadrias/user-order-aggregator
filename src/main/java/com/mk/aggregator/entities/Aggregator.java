package com.mk.aggregator.entities;

import java.util.ArrayList;
import java.util.List;

public class Aggregator {

	UserBean userBean = new UserBean();

	List<OrderBean> orderBean = new ArrayList<>();

	String host;

	public UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}

	public List<OrderBean> getOrderBean() {
		return orderBean;
	}

	public void setOrderBean(List<OrderBean> orderBean) {
		this.orderBean = orderBean;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	@Override
	public String toString() {
		return "Aggregator [userBean=" + userBean + ", orderBean=" + orderBean + ", host=" + host + "]";
	}

}
