package com.mk.aggregator.controllers;

import java.util.NoSuchElementException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mk.aggregator.entities.Aggregator;
import com.mk.aggregator.services.AggregatorService;

@RestController
public class AggregatorController {

	private static final Logger LOGGER = LoggerFactory.getLogger(AggregatorController.class);

	@Autowired
	private AggregatorService aggregatorService;

	@GetMapping("/")
	public String imHealthy() {
		return "{healthy:true}";
	}

	@GetMapping({"/aggregators/{userId}","/orderdetails/{userId}"})
	public ResponseEntity<Aggregator> findByUserId(@PathVariable Integer userId) {
		try {
			Aggregator aggregator = aggregatorService.findByUserId(userId);
			return new ResponseEntity<Aggregator>(aggregator, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Aggregator>(HttpStatus.NOT_FOUND);
		}
	}

}