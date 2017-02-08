package com.xc.bl.car.dao;

import java.util.List;

import com.xc.bl.car.pojo.CarGradeAllInfoMd;
import com.xc.bl.car.pojo.CarGradeAllInfoPo;
import com.xc.bl.entities.CarGrade;

public interface ICarGradeDao {
	
	public CarGrade getCarGradeByUnique(String cgname,int cgy,String cge,int cmid);
	
	public CarGradeAllInfoPo getCarGradeAllInfoById(int cgid);
	
	//==================================================
	
	/**
	 * 添加车配置等级
	 * 
	 * @param carGrade
	 */
	public void addCarGrade(CarGrade carGrade);

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
	
	/**
	 * 更新车配置等级列表
	 * @param carGrade
	 */
	public void updateCarGrade(CarGrade carGrade);
}
