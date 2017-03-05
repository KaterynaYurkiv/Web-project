package ua.com.clothes_shop.service;

import java.util.List;

import ua.com.clothes_shop.entity.TypeOfClothing;

public interface TypeOfClothingService {
	
    void save(TypeOfClothing typeOfClothing);
    
    void save(String itemType);
	
	List<TypeOfClothing> findAll();
	
	TypeOfClothing findOne(int id);
	
	void delete(int id);
	
	void update (TypeOfClothing typeOfClothing);
	
	TypeOfClothing findByItemType(String itemType);

}
