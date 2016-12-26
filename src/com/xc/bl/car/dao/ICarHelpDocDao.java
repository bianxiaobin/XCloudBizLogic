package com.xc.bl.car.dao;

import java.util.List;

import com.xc.bl.entities.CarHelpDoc;

public interface ICarHelpDocDao {
	/**
	 * 根据车的配置获得文档
	 * @param carGradeId 车型配置
	 * @return
	 */
	public CarHelpDoc getCarHelpDocById(int carGradeId);
	public List<CarHelpDoc> getDocAll();
}
