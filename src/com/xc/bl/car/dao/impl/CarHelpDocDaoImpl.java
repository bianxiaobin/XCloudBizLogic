package com.xc.bl.car.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xc.bl.car.dao.ICarHelpDocDao;
import com.xc.bl.entities.CarHelpDoc;
import com.xc.bl.entities.dao.IBaseDAO;
@Repository("carHelpDocDao")
public class CarHelpDocDaoImpl implements ICarHelpDocDao {
	@Autowired
	private IBaseDAO<CarHelpDoc> baseDAO;
	@Override
	public CarHelpDoc getCarHelpDocById(int carGradeId) {
		return baseDAO.get("from CarHelpDoc where carGradeId=?", new Object[]{carGradeId});
	}
	@Override
	public List<CarHelpDoc> getDocAll() {
		return baseDAO.find("from CarHelpDoc");
	}

}
