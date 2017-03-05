package ua.com.clothes_shop.service;

import java.util.List;

import ua.com.clothes_shop.entity.Color;

public interface ColorService {
	
    void save(Color color);
	
	List<Color> findAll();
	
	Color findOne(int id);
	
	void delete(int id);
	
	void update (Color color);
	
	Color findByColor(String color);
	
//	Color fetchColorWithItemsOfClothing(int marking);
//	
//	List<Color> findByItemOfClothingId(int id);

}
