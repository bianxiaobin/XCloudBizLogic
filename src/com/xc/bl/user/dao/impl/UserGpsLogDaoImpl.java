package com.xc.bl.user.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xc.bl.entities.UserGpsLog;
import com.xc.bl.entities.dao.IBaseDAO;
import com.xc.bl.user.dao.IUserGpsLogDao;

@Repository("userGpsLogDao")
public class UserGpsLogDaoImpl implements IUserGpsLogDao{
	
	@Autowired
	private IBaseDAO<UserGpsLog> baseDAO;

	@Override
	public void addUserGpsLog(UserGpsLog ugl) {
		baseDAO.save(ugl);
	}
}
