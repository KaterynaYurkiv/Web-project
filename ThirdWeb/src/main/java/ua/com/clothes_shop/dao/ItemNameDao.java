package ua.com.clothes_shop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.clothes_shop.entity.ItemName;

public interface ItemNameDao extends JpaRepository<ItemName, Integer>{
	
	ItemName findByName(String name);

}
