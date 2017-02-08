package com.xc.bl.car.dao;

import java.util.List;

import com.xc.bl.entities.CarBrand;
import com.xc.bl.utils.CommonDefine.BrandType;

public interface ICarBrandDao {
	
	public List<CarBrand> getCarBrandList(BrandType type, int maxCount);
	
	//=============================================
	
	
	/**
	 * 添加车品牌
	 * 
	 * @param carBrand
	 */
	public void addCarBrand(CarBrand carBrand);

	/**
	 * 获得车品牌，根据id
	 * 
	 * @param cbid
	 * @return
	 */
	public CarBrand getCarBrandById(int cbid);

	/**
	 * 获得车品牌，根据品牌名
	 * 
	 * @param CBName
	 * @return
	 */
	public CarBrand getCarBrandByName(String CBName);
	
	/***
	 * 更新车品牌
	 * @param carBrand
	 */
	public void updateCatBrand(CarBrand carBrand);
}
