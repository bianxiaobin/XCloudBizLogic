package com.xc.bl.car.service;

import java.util.List;

import com.xc.bl.entities.CarFactory;

public interface ICarFactoryService {
	/**
	 * 添加车生产
	 * 
	 * @param carFactory
	 */
	public void addCarFactory(CarFactory carFactory);

	/**
	 * 获得车生产商信息，根据id
	 * 
	 * @param cfid
	 * @return
	 */
	public CarFactory getCarFactoryById(int cfid);

	/**
	 * 获得车生产商信息，根据生产商名
	 * 
	 * @param CFName
	 * @return
	 */
	public CarFactory getCarFactoryByName(String CFName);

	/**
	 * 获得车生产商信息，根据品牌id
	 * 
	 * @param cbid
	 * @return
	 */
	public List<CarFactory> getCarFactoryByCbid(int cbid);

}
