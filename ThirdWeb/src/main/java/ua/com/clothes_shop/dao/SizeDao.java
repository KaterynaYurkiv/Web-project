package ua.com.clothes_shop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.clothes_shop.entity.Size;

public interface SizeDao extends JpaRepository<Size, Integer>{
	
	Size findBySize(String size);

}
