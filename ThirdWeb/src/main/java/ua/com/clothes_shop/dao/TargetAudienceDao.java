package ua.com.clothes_shop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.clothes_shop.entity.TargetAudience;

public interface TargetAudienceDao extends JpaRepository<TargetAudience, Integer>{
	
	TargetAudience findByCategory(String category);

}
