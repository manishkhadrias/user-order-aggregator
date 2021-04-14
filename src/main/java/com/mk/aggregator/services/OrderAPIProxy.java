package com.mk.aggregator.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mk.aggregator.entities.OrderBean;

@FeignClient(name = "order-api", url = "${ORDER_API_URI:http://localhost}:8000")//
//@FeignClient(name = "order-api")//Kubernetes Service Name
public interface OrderAPIProxy {
	@GetMapping("/orders/{userId}")
	public ResponseEntity<List<OrderBean>> findByUserId(@PathVariable Integer userId);
}