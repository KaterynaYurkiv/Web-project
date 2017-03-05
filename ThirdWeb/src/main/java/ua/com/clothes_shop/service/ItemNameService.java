package ua.com.clothes_shop.service;

import java.util.List;

import ua.com.clothes_shop.entity.ItemName;

public interface ItemNameService {
	
    void save(ItemName itemName);
	
	List<ItemName> findAll();
	
	ItemName findOne(int id);
	
	void delete(int id);
	
	void update (ItemName itemName);
	
	ItemName findByName(String name);

}
