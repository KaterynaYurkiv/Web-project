package ua.com.clothes_shop.service;

import java.util.List;

import ua.com.clothes_shop.entity.Brand;

public interface BrandService {
	
    void save(Brand brand);
    
    void save(String brandName);
	
	List<Brand> findAll();
	
	Brand findOne(int id);
	
	void delete(int id);
	
	void update (Brand brand);
	
	Brand findByBrandName(String brandName);


}
