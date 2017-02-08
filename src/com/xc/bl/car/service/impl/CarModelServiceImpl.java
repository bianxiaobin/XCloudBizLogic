package com.xc.bl.car.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.car.dao.ICarModelDao;
import com.xc.bl.car.service.ICarModelService;
import com.xc.bl.entities.CarModel;

@Service("carModelService")
public class CarModelServiceImpl implements ICarModelService {

	@Autowired
	private ICarModelDao carModelDao;

	@Override
	public void addCarModel(CarModel carModel) {

		carModelDao.addCarModel(carModel);
	}

	@Override
	public CarModel getCarModelById(int cmid) {

		return carModelDao.getCarModelById(cmid);
	}

	@Override
	public CarModel getCarModelByName(String CMName) {
		return carModelDao.getCarModelByName(CMName);
	}

	@Override
	public List<CarModel> getCarModelByCfid(int cfid) {
		return carModelDao.getCarModelByCfid(cfid);
	}

	@Override
	public void updateCarModel(CarModel carModel) {
		carModelDao.updateCarModel(carModel);
	}

}
