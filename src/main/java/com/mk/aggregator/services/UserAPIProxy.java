package com.mk.aggregator.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mk.aggregator.entities.UserBean;

@FeignClient(name = "user-api", url = "${USER_API_URI:http://localhost}:8100") //
//@FeignClient(name = "user-api")//Kubernetes Service Name
public interface UserAPIProxy {
	@GetMapping("/users/{id}")
	public ResponseEntity<UserBean> findById(@PathVariable Integer id);
}