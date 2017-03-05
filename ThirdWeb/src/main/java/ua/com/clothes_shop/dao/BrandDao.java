package ua.com.clothes_shop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.clothes_shop.entity.Brand;

public interface BrandDao extends JpaRepository<Brand, Integer>{
	
	Brand findByBrandName(String BrandName);

}
