package com.xc.bl.user.service.impl;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.entities.User;
import com.xc.bl.user.dao.IUserInfoDao;
import com.xc.bl.user.service.IUserInfoService;

@Service("userInfoService")
public class UserInfoServiceImpl implements IUserInfoService {
	public static Logger logger = Logger.getLogger(UserInfoServiceImpl.class);

	@Autowired
	private IUserInfoDao userInfoDao;

	@Override
	public void addUser(User user) {

		userInfoDao.addUser(user);

	}

	@Override
	public User getUserById(long uid) {

		return userInfoDao.getUserById(uid);
	}

	@Override
	public User getUserByPhone(long phoneNum) {

		return userInfoDao.getUserByPhone(phoneNum);

	}

	@Override
	public int UpdLastLoginTime(long uid) {

		return userInfoDao.updLastLoginTime(uid);

	}

	@Override
	public long getUserCount() {
		return userInfoDao.getUserCount();
	}

}
