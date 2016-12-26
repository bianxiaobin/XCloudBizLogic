package com.xc.bl.car.service;

import java.util.List;

import com.xc.bl.entities.CarHelpDoc;

public interface ICarHelpDocService {
	public CarHelpDoc getCarHelpDocById(int carGradeId);
	public List<CarHelpDoc> getDocAll();
}
