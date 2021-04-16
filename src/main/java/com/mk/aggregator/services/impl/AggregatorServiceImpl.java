package com.mk.aggregator.services.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.mk.aggregator.entities.Aggregator;
import com.mk.aggregator.services.AggregatorService;
import com.mk.aggregator.services.OrderAPIProxy;
import com.mk.aggregator.services.UserAPIProxy;

@Service
public class AggregatorServiceImpl implements AggregatorService {

	private static final String HOST_NAME = "HOSTNAME";

	private static final String DEFAULT_ENV_INSTANCE_GUID = "UNKNOWN";

	private static final Logger LOGGER = LoggerFactory.getLogger(AggregatorServiceImpl.class);

	@Value("${" + HOST_NAME + ":" + DEFAULT_ENV_INSTANCE_GUID + "}")
	private String hostName;

	@Autowired
	OrderAPIProxy orderAPIProxy;

	@Autowired
	UserAPIProxy userAPIProxy;

	@Override
	public Aggregator findByUserId(Integer userId) {

		LOGGER.info("Received Request to findByUserId HOST_NAME {}. ", hostName);
		Aggregator aggregator = new Aggregator();
		aggregator.setHost(hostName);
		aggregator.setOrders(orderAPIProxy.findByUserId(userId).getBody());
		aggregator.setUserDetails(userAPIProxy.findById(userId).getBody());
		return aggregator;
	}

}