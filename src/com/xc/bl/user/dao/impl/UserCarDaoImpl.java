package com.xc.bl.user.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xc.bl.entities.UserCar;
import com.xc.bl.entities.dao.IBaseDAO;
import com.xc.bl.user.dao.IUserCarDao;

@Repository("userCarDao")
public class UserCarDaoImpl implements IUserCarDao {

	@Autowired
	private IBaseDAO<UserCar> baseDAO;
	
	@Override
	public void addUserCar(UserCar uc) {
		baseDAO.save(uc);
	}

}
