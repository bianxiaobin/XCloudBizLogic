package com.xc.bl.car.service;

import com.xc.bl.pojo.Car;

public interface ICarInfo {
	/**
	 * 添加车
	 * 
	 * @param car
	 */
	public Car addCar(Car car);

	/**
	 * 更新车信息，根据CarId
	 * 
	 * @param car
	 * @return
	 */
	public int updCarInfoById(Car car);

	/**
	 * 获得车信息，根据CarId
	 * 
	 * @param cid
	 * @return
	 */
	public Car getCarById(long cid);
}
