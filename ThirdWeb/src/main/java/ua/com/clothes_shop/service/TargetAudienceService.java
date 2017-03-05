package ua.com.clothes_shop.service;

import java.util.List;

import ua.com.clothes_shop.entity.TargetAudience;

public interface TargetAudienceService {
	
    void save(TargetAudience targetAudience);
    
    void save(String category);
	
	List<TargetAudience> findAll();
	
	TargetAudience findOne(int id);
	
	void delete(int id);
	
	void update (TargetAudience targetAudience);
	
	TargetAudience findByCategory(String category);

}
