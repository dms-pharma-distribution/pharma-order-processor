package com.pharma.order.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pharma.order.entity.RatingEntity;

@Repository
public interface RatingRepository extends JpaRepository<RatingEntity, Long> {
	
	public RatingEntity findByOrderGuid(UUID orderGuid);
}
