package com.xc.bl.car.dao;

import com.xc.bl.car.pojo.CarGradeAllInfoMd;
import com.xc.bl.car.pojo.CarGradeAllInfoPo;
import com.xc.bl.pojo.CarGrade;

public interface ICarGradeDao {
	public CarGrade getCarGradeByUnique(String cgname,int cgy,String cge,int cmid);
	
	public CarGradeAllInfoPo getCarGradeAllInfoById(int cgid);
	
}
