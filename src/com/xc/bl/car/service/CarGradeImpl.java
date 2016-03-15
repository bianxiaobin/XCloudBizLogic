package com.xc.bl.car.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xc.bl.car.dao.CarGradeDaoImpl;
import com.xc.bl.car.dao.ICarGradeDao;
import com.xc.bl.car.po.CarGradeAllInfoPo;
import com.xc.bl.pojo.Car;
import com.xc.bl.pojo.CarGrade;
import com.xc.bl.pojo.CarGradeDAO;
import com.xc.bl.pojo.HibernateSessionFactory;

public class CarGradeImpl implements ICarGrade {

	@Override
	public CarGrade addCarGrade(CarGrade carGrade) {
		CarGradeDAO carGradeDao = new CarGradeDAO();
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		try {
			carGradeDao.save(carGrade);
			tx.commit();
		} catch (Exception ex) {
			tx.rollback();
		} finally {
			session.close();
		}
		return carGrade;
	}

	@Override
	public CarGrade getCarGradeById(int cgid) {
		CarGradeDAO carGradeDao=new CarGradeDAO();
		return carGradeDao.findById(cgid);
	}

	@Override
	public CarGrade getCarGradeByName(String CGName) {
		CarGradeDAO carGradeDao=new CarGradeDAO();
		List<CarGrade> cg_list=carGradeDao.findByCarGradeName(CGName);
		if(cg_list==null || cg_list.isEmpty()){
			return null;
		}
		return cg_list.get(0);
	}

	@Override
	public List<CarGrade> getCarGradeByCmid(int cmid) {
		CarGradeDAO carGradeDao=new CarGradeDAO();
		return carGradeDao.findByCarModelId(cmid);
	}


	@Override
	public CarGrade getCarGradeByUnique(String cgname, int cgy, String cge,
			int cmid) {
		ICarGradeDao iCarGradeDao=new CarGradeDaoImpl();
		return iCarGradeDao.getCarGradeByUnique(cgname, cgy, cge, cmid);
	}

	@Override
	public CarGradeAllInfoPo getCarGradeAllInfoById(int cgid) {
		ICarGradeDao iCarGradeDao=new CarGradeDaoImpl();
		return iCarGradeDao.getCarGradeAllInfoById(cgid);
	}
}
