package com.xc.bl.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.entities.UserGpsLog;
import com.xc.bl.user.dao.IUserGpsLogDao;
import com.xc.bl.user.service.IUserGpsLogService;

@Service("userGpsLogService")
public class UserGpsLogServiceImpl implements IUserGpsLogService {

	@Autowired
	private IUserGpsLogDao iUserGpsLogDao;
	
	@Override
	public void addUserGpsLog(UserGpsLog ugl) {
		iUserGpsLogDao.addUserGpsLog(ugl);
	}
}
