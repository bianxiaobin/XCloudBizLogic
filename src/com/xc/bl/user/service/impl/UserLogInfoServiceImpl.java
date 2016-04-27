package com.xc.bl.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.entities.UserLog;
import com.xc.bl.entities.dao.IBaseDAO;
import com.xc.bl.user.service.IUserLogInfoService;

@Service("userLoginfoService")
public class UserLogInfoServiceImpl implements IUserLogInfoService {

	@Autowired
	private IBaseDAO<UserLog> baseDAO;

	@Override
	public void addUserLog(UserLog user_log) {

		baseDAO.save(user_log);

	}
}
