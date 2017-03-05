package ua.com.clothes_shop.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.clothes_shop.dao.ItemNameDao;
import ua.com.clothes_shop.entity.ItemName;
import ua.com.clothes_shop.service.ItemNameService;

@Service
public class ItemNameServiceImpl implements ItemNameService{
	
	@Autowired
	private ItemNameDao itemNameDao;

	@Override
	public void save(ItemName itemName) {
		itemNameDao.save(itemName);
	}

	@Override
	public List<ItemName> findAll() {
		return itemNameDao.findAll();
	}

	@Override
	public ItemName findOne(int id) {
		return itemNameDao.findOne(id);
	}

	@Override
	public void delete(int id) {
		itemNameDao.delete(id);
	}

	@Override
	public void update(ItemName itemName) {
		itemNameDao.save(itemName);
	}

	@Override
	public ItemName findByName(String name) {
		return itemNameDao.findByName(name);
	}

}
