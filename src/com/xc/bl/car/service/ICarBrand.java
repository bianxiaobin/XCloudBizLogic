package com.xc.bl.car.service;

import java.util.List;

import com.xc.bl.pojo.CarBrand;
import com.xc.bl.utils.CommonDefine.BrandType;

public interface ICarBrand {	

	/**
	 * 获得车品牌列表
	 * 
	 * @param type  BrandType
	 *           	BrandType  ALL：全部车  HOT：热门车  NOT_HOT：非热门车
	 * @param maxCount
	 *            返回最大条数(最大300)
	 * @return
	 */
	public List<CarBrand> getCarBrandList(BrandType type, int maxCount);

	/**
	 * 添加车品牌
	 * 
	 * @param carBrand
	 */
	public CarBrand addCarBrand(CarBrand carBrand);

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
	
	
	

}
