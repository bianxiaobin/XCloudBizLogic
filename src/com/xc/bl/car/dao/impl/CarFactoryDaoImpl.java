package com.xc.bl.car.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xc.bl.car.dao.ICarFactoryDao;
import com.xc.bl.entities.CarFactory;
import com.xc.bl.entities.dao.IBaseDAO;

@Repository("carFactoryDao")
public class CarFactoryDaoImpl implements ICarFactoryDao {

	@Autowired
	private IBaseDAO<CarFactory> baseDAO;

	@Override
	public void addCarFactory(CarFactory carFactory) {
		baseDAO.save(carFactory);
	}

	@Override
	public CarFactory getCarFactoryById(int cfid) {

		return baseDAO.get("from CarFactory where carFactoryId=?",
				new Object[] { cfid });

	}

	@Override
	public CarFactory getCarFactoryByName(String CFName) {

		return baseDAO.get("from CarFactory where carFactoryName=?",
				new Object[] { CFName });
	}

	@Override
	public List<CarFactory> getCarFactoryByCbid(int cbid) {

		return baseDAO.find("from CarFactory where carBrandId=?",
				new Object[] { cbid });

	}

}
