package ua.com.clothes_shop.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.clothes_shop.dao.ColorDao;
import ua.com.clothes_shop.entity.Color;
import ua.com.clothes_shop.service.ColorService;

@Service //� �������� ������ ������� ���
public class ColorServiceImpl implements ColorService{
	
	@Autowired
	private ColorDao colorDao;

	@Override
	public void save(Color color) {
		colorDao.save(color);
	}

	@Override
	public List<Color> findAll() {
		return colorDao.findAll();
	}

	@Override
	public Color findOne(int id) {
		return colorDao.findOne(id);
	}

	@Override
	public void delete(int id) {
		colorDao.delete(id);
	}

	@Override
	public void update(Color color) {
		colorDao.save(color);
	}

	@Override
	public Color findByColor(String color) {
		return colorDao.findByColor(color);
	}

//	@Override
//	public Color fetchColorWithItemsOfClothing(int marking) {
//		return colorDao.fetchColorWithItemsOfClothing(marking);
//	}

//	@Override
//	public List<Color> findByItemOfClothingId(int id) {
//		return colorDao.findByItemOfClothingId(id);
//	}

}
