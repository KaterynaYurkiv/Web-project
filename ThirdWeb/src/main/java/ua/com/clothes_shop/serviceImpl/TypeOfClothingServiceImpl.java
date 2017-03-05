package ua.com.clothes_shop.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.clothes_shop.dao.TypeOfClothingDao;
import ua.com.clothes_shop.entity.TypeOfClothing;
import ua.com.clothes_shop.service.TypeOfClothingService;

@Service //в контексті спрінга створює біни
public class TypeOfClothingServiceImpl implements TypeOfClothingService{
	
	@Autowired
	private TypeOfClothingDao typeOfClothingDao;

	@Override
	public void save(TypeOfClothing typeOfClothing) {
		typeOfClothingDao.save(typeOfClothing);
	}

	@Override
	public List<TypeOfClothing> findAll() {
		return typeOfClothingDao.findAll();
	}

	@Override
	public TypeOfClothing findOne(int id) {
		return typeOfClothingDao.findOne(id);
	}

	@Override
	public void delete(int id) {
		typeOfClothingDao.delete(id);
	}

	@Override
	public void update(TypeOfClothing typeOfClothing) {
		typeOfClothingDao.save(typeOfClothing);
	}

	@Override
	public void save(String itemType) {
		TypeOfClothing typeOfClothing = new TypeOfClothing();
		typeOfClothing.setItemType(itemType);
		typeOfClothingDao.save(typeOfClothing);
	}

	@Override
	public TypeOfClothing findByItemType(String itemType) {
		return typeOfClothingDao.findByItemType(itemType);
	}

}
