package com.xc.bl.car.service;

import java.util.List;

import com.xc.bl.pojo.CarGrade;

public interface ICarGrade {
	/**
	 * 添加车配置等级
	 * 
	 * @param carGrade
	 */
	public CarGrade addCarGrade(CarGrade carGrade);

	/**
	 * 获得车配置等级信息，根据id
	 * 
	 * @param cgid
	 * @return
	 */
	public CarGrade getCarGradeById(int cgid);

	/**
	 * 获得车配置等级信息，根据名字
	 * 
	 * @param CGName
	 * @return
	 */
	public CarGrade getCarGradeByName(String CGName);

	/**
	 * 获得车配置等级列表，根据车型号id
	 * 
	 * @param cmid
	 * @return
	 */
	public List<CarGrade> getCarGradeByCmid(int cmid);
	
	
}
