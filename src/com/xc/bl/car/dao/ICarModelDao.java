package com.xc.bl.car.dao;

import java.util.List;

import com.xc.bl.entities.CarModel;

public interface ICarModelDao {

	//=================================================
	
	/**
	 * 添加车型
	 * 
	 * @param carModel
	 */
	public CarModel addCarModel(CarModel carModel);

	/**
	 * 获得车型信息，根据id
	 * 
	 * @param cmid
	 * @return
	 */
	public CarModel getCarModelById(int cmid);

	/**
	 * 获得车型信息，根据名字
	 * 
	 * @param CMName
	 * @return
	 */
	public CarModel getCarModelByName(String CMName);

	/**
	 * 获得车型列表，根据生产商id
	 * 
	 * @param cfid
	 * @return
	 */
	public List<CarModel> getCarModelByCfid(int cfid);
}
