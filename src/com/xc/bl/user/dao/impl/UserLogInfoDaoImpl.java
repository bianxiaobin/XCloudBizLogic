package com.xc.bl.user.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xc.bl.entities.UserLog;
import com.xc.bl.entities.dao.IBaseDAO;
import com.xc.bl.user.dao.IUserLogInfoDao;

@Repository("userLoginfoDao")
public class UserLogInfoDaoImpl implements IUserLogInfoDao {

	@Autowired
	private IBaseDAO<UserLog> baseDAO;

	@Override
	public void addUserLog(UserLog user_log) {

		baseDAO.save(user_log);
	}
}
