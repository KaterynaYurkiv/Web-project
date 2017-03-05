package ua.com.clothes_shop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.clothes_shop.entity.TypeOfClothing;

public interface TypeOfClothingDao extends JpaRepository<TypeOfClothing, Integer>{
	
	TypeOfClothing findByItemType(String itemType);

}
