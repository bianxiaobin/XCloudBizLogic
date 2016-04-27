package com.xc.bl.car.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.car.dao.ICarGradeDao;
import com.xc.bl.car.pojo.CarGradeAllInfoPo;
import com.xc.bl.car.service.ICarGradeService;
import com.xc.bl.entities.CarGrade;
import com.xc.bl.utils.SpringUtils;

@Service("carGradeService")
public class CarGradeServiceImpl implements ICarGradeService {

	@Autowired
	private ICarGradeDao carGradeDao;

	@Override
	public void addCarGrade(CarGrade carGrade) {
		carGradeDao.addCarGrade(carGrade);
	}

	@Override
	public CarGrade getCarGradeById(int cgid) {
		return carGradeDao.getCarGradeById(cgid);
	}

	@Override
	public CarGrade getCarGradeByName(String CGName) {
		return carGradeDao.getCarGradeByName(CGName);
	}

	@Override
	public List<CarGrade> getCarGradeByCmid(int cmid) {
		return carGradeDao.getCarGradeByCmid(cmid);
	}

	@Override
	public CarGrade getCarGradeByUnique(String cgname, int cgy, String cge,
			int cmid) {

		return ((ICarGradeDao) SpringUtils.getBean("carGradeDao"))
				.getCarGradeByUnique(cgname, cgy, cge, cmid);

	}

	@Override
	public CarGradeAllInfoPo getCarGradeAllInfoById(int cgid) {

		return ((ICarGradeDao) SpringUtils.getBean("carGradeDao"))
				.getCarGradeAllInfoById(cgid);

	}
}
