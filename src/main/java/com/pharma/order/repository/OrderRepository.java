
package com.pharma.order.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pharma.order.entity.OrderEntity;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, UUID> {
	 
	public OrderEntity findByOrderCode(Long orderCode);
	
	default void createOrUpdate(OrderEntity orderEntity) {
		Optional<OrderEntity> orderEntityOptional = findById(orderEntity.getOrderGuid());
		if(orderEntityOptional.isPresent()) {
			var orderEntityExists = orderEntityOptional.get();
			BeanUtils.copyProperties(orderEntity, orderEntityExists);
			 save(orderEntityExists);
		}else {
			save(orderEntity);
		}			
	}
}
