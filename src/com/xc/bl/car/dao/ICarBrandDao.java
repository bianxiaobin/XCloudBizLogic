package com.xc.bl.car.dao;

import java.util.List;

import com.xc.bl.pojo.CarBrand;

public interface ICarBrandDao {
	public List<CarBrand> getCarBrandList(int type, int maxCount);
}
