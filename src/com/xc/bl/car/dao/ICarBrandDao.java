package com.xc.bl.car.dao;

import java.util.List;

import com.xc.bl.pojo.CarBrand;
import com.xc.bl.utils.CommonDefine.BrandType;

public interface ICarBrandDao {
	public List<CarBrand> getCarBrandList1(BrandType type, int maxCount);
}
