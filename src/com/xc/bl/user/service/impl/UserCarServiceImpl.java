package com.xc.bl.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.entities.UserCar;
import com.xc.bl.user.dao.IUserCarDao;
import com.xc.bl.user.service.IUserCarService;

@Service("userCarService")
public class UserCarServiceImpl implements IUserCarService {

	@Autowired
	private IUserCarDao iUserCarDao;
	
	@Override
	public void addUserCar(UserCar uc) {
		iUserCarDao.addUserCar(uc);
	}

}
