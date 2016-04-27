package com.xc.bl.car.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.car.dao.ICarFactoryDao;
import com.xc.bl.car.service.ICarFactoryService;
import com.xc.bl.entities.CarFactory;

@Service("carFactoryService")
public class CarFactoryServiceImpl implements ICarFactoryService {

	@Autowired
	private ICarFactoryDao carFactoryDao;

	@Override
	public void addCarFactory(CarFactory carFactory) {
		carFactoryDao.addCarFactory(carFactory);
	}

	@Override
	public CarFactory getCarFactoryById(int cfid) {
		return carFactoryDao.getCarFactoryById(cfid);
	}

	@Override
	public CarFactory getCarFactoryByName(String CFName) {
		return carFactoryDao.getCarFactoryByName(CFName);
	}

	@Override
	public List<CarFactory> getCarFactoryByCbid(int cbid) {
		return carFactoryDao.getCarFactoryByCbid(cbid);
	}

}
