package com.xc.bl.car.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.car.dao.ICarBrandDao;
import com.xc.bl.car.service.ICarBrandService;
import com.xc.bl.entities.CarBrand;
import com.xc.bl.utils.CommonDefine.BrandType;

@Service("carBrandService")
public class CarBrandServiceImpl implements ICarBrandService {

	@Autowired
	private ICarBrandDao carBrandDao;

	@Override
	public List<CarBrand> getCarBrandList(BrandType type, int maxCount) {
		// 最大返回300
		if (maxCount > 300) {
			maxCount = 300;
		}
		return carBrandDao.getCarBrandList(type, maxCount);
	}

	@Override
	public void addCarBrand(CarBrand carBrand) {

		carBrandDao.addCarBrand(carBrand);

	}

	@Override
	public CarBrand getCarBrandById(int cbid) {

		return carBrandDao.getCarBrandById(cbid);

	}

	@Override
	public CarBrand getCarBrandByName(String CBName) {

		return carBrandDao.getCarBrandByName(CBName);

	}

}
