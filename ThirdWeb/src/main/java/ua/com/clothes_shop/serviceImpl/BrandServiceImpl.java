package ua.com.clothes_shop.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.clothes_shop.dao.BrandDao;
import ua.com.clothes_shop.entity.Brand;
import ua.com.clothes_shop.service.BrandService;

@Service //в контексті спрінга створює біни
public class BrandServiceImpl implements BrandService{
	
	@Autowired
	private BrandDao brandDao;

	@Override
	public void save(Brand brand) {
		brandDao.save(brand);
	}

	@Override
	public List<Brand> findAll() {
		return brandDao.findAll();
	}

	@Override
	public Brand findOne(int id) {
		return brandDao.findOne(id);
	}

	@Override
	public void delete(int id) {
		brandDao.delete(id);
	}

	@Override
	public void update(Brand brand) {
		brandDao.save(brand);
	}

	@Override
	public void save(String brandName) {	
			Brand brand = new Brand();
			brand.setBrandName(brandName);
			brandDao.save(brand);
	}

	@Override
	public Brand findByBrandName(String brandName) {
		return brandDao.findByBrandName(brandName);
	}

}
