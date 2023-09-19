package com.pharma.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pharma.order.entity.OrderEntity;
import com.pharma.order.entity.OrderHistoryEntity;

@Repository
public interface OrderHistoryRepository extends JpaRepository<OrderHistoryEntity, Long> {
	
	public OrderHistoryEntity findByOrderEntity(OrderEntity orderEntity);
}
