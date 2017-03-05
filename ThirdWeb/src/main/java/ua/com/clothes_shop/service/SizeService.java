package ua.com.clothes_shop.service;

import java.util.List;

import ua.com.clothes_shop.entity.Size;

public interface SizeService {
	
    void save(Size size);
    
    void save(String size);
	
	List<Size> findAll();
	
	Size findOne(int id);
	
	void delete(int id);
	
	void update (Size size);
	
	Size findBySize(String size);

}
