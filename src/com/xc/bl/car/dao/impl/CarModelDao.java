package com.xc.bl.car.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xc.bl.car.dao.ICarModelDao;
import com.xc.bl.entities.CarModel;
import com.xc.bl.entities.dao.IBaseDAO;

@Repository("carModelDao")
public class CarModelDao implements ICarModelDao {

	@Autowired
	private IBaseDAO<CarModel> baseDAO;

	@Override
	public void addCarModel(CarModel carModel) {
		baseDAO.save(carModel);
	}

	@Override
	public CarModel getCarModelById(int cmid) {

		return baseDAO.get("from CarModel where carModelId=?",
				new Object[] { cmid });
	}

	@Override
	public CarModel getCarModelByName(String CMName) {

		return baseDAO.get("from CarModel where carModelName=?",
				new Object[] { CMName });

	}

	@Override
	public List<CarModel> getCarModelByCfid(int cfid) {

		return baseDAO.find("from CarModel where carFactoryId=?",
				new Object[] { cfid });

	}

	@Override
	public void updateCarModel(CarModel carModel) {
		baseDAO.update(carModel);
	}

}
