package com.pharma.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pharma.order.dto.OrderDto;
import com.pharma.order.entity.OrderEntity;
import com.pharma.order.mapper.OrderCommandMapper;
import com.pharma.order.repository.OrderHistoryRepository;
import com.pharma.order.repository.OrderRepository;

@Service
@Transactional
public class OrderService {

	OrderRepository orderRepository;

	OrderHistoryRepository orderHistoryRepository;

	OrderCommandMapper orderCommandMapper;
	
	ObjectMapper objectMapper;

	@Autowired
	public OrderService(OrderRepository orderRepository, OrderHistoryRepository orderHistoryRepository,
			OrderCommandMapper orderCommandMapper, ObjectMapper objectMapper) {
		super();
		this.orderRepository = orderRepository;
		this.orderHistoryRepository = orderHistoryRepository;
		this.orderCommandMapper = orderCommandMapper;
		this.objectMapper = objectMapper;
	}
	public void orderCommandProcessor(String orderMessage) {
		try {
			OrderEntity orderEntity = processOrders(orderMessage);
			orderRepository.saveAndFlush(orderEntity);
			orderHistoryRepository.saveAndFlush(orderCommandMapper.mapToOrderHistoryEntity(orderEntity,
					orderRepository.findByOrderCode(orderEntity.getOrderCode())));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	public OrderEntity processOrders(String body) throws JsonMappingException, JsonProcessingException {
		return orderCommandMapper.mapToOrderEntity(objectMapper.readValue(body, OrderDto.class));
	}
}
