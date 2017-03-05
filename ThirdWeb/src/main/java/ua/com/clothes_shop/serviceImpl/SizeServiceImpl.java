package ua.com.clothes_shop.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.clothes_shop.dao.SizeDao;
import ua.com.clothes_shop.entity.Size;
import ua.com.clothes_shop.service.SizeService;

@Service //в контексті спрінга створює біни
public class SizeServiceImpl implements SizeService{
	
	@Autowired
	private SizeDao sizeDao;

	@Override
	public void save(Size size) {
		size.getSize().toUpperCase();  //можна прописувати додаткову логіку
		sizeDao.save(size);
	}

	@Override
	public List<Size> findAll() {
		return sizeDao.findAll();
	}

	@Override
	public Size findOne(int id) {
		return sizeDao.findOne(id);
	}

	@Override
	public void delete(int id) {
		sizeDao.delete(id);
	}

	@Override
	public void update(Size size) {
		sizeDao.save(size);
	}

	@Override
	public void save(String size) {
		Size s = new Size();
		s.setSize(size);
		sizeDao.save(s);
	}

	@Override
	public Size findBySize(String size) {
		return sizeDao.findBySize(size);
	}

}
