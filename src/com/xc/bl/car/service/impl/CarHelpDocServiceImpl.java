package com.xc.bl.car.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.car.dao.ICarHelpDocDao;
import com.xc.bl.car.service.ICarHelpDocService;
import com.xc.bl.entities.CarHelpDoc;

@Service("carHelpDocService")
public class CarHelpDocServiceImpl implements ICarHelpDocService {
	@Autowired
	private ICarHelpDocDao dao;
	@Override
	public CarHelpDoc getCarHelpDocById(int carGradeId) {
		return dao.getCarHelpDocById(carGradeId);
	}
	@Override
	public List<CarHelpDoc> getDocAll() {
		return dao.getDocAll();
	}

}
