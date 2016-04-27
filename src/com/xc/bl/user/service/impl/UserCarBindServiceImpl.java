package com.xc.bl.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.car.service.ICarInfoService;
import com.xc.bl.entities.Car;
import com.xc.bl.entities.UserCarBind;
import com.xc.bl.user.dao.IUserCarBindDao;
import com.xc.bl.user.service.IUserCarBindService;
import com.xc.bl.utils.SpringUtils;

@Service("userCarBindService")
public class UserCarBindServiceImpl implements IUserCarBindService {

	@Autowired
	private IUserCarBindDao userCarBindDao;

	@Override
	public void addUserCarBind(UserCarBind ucb) {
		userCarBindDao.addUserCarBind(ucb);
	}

	@Override
	public List<UserCarBind> getUserCarBindByUid(long uid) {
		return userCarBindDao.getUserCarBindByUid(uid);
	}

	@Override
	public UserCarBind addUserNewCarBind(long uid, Car car) {
		
		// 添加Car
		ICarInfoService iCarInfoService = SpringUtils.getBean("carInfoService");
		iCarInfoService.addCar(car);
		
		UserCarBind userCarBind = new UserCarBind();
		userCarBind.setCarId(car.getCarId());
		userCarBind.setUserId(uid);

		// 添加User Car绑定关系
		userCarBindDao.addUserCarBind(userCarBind);

		return userCarBind;
	}

	@Override
	public UserCarBind getUserCarBindById(long ubid) {
		return userCarBindDao.getUserCarBindById(ubid);

	}
}
