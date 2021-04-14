package com.mk.aggregator.services;

import com.mk.aggregator.entities.Aggregator;

public interface AggregatorService {

	Aggregator findByUserId(Integer userId);

}