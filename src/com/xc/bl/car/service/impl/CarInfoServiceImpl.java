package com.xc.bl.car.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.car.dao.ICarInfoDao;
import com.xc.bl.car.service.ICarInfoService;
import com.xc.bl.entities.Car;

@Service("carInfoService")
public class CarInfoServiceImpl implements ICarInfoService {

	@Autowired
	private ICarInfoDao carInfoDao;

	@Override
	public void addCar(Car car) {

		carInfoDao.addCar(car);
	}

	@Override
	public int updCarInfoById(Car car) {

		return carInfoDao.updCarInfoById(car);
	}

	@Override
	public Car getCarById(long cid) {

		return carInfoDao.getCarById(cid);
	}

}
