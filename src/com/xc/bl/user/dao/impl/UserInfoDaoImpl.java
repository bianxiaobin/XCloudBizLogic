package com.xc.bl.user.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xc.bl.entities.User;
import com.xc.bl.entities.dao.IBaseDAO;
import com.xc.bl.user.dao.IUserInfoDao;
import com.xc.bl.utils.CommonUtils;

@Repository("userInfoDao")
public class UserInfoDaoImpl implements IUserInfoDao {
	public static Logger logger = Logger.getLogger(UserInfoDaoImpl.class);

	@Autowired
	private IBaseDAO<User> baseDAO;

	@Override
	public int updLastLoginTime(long uid) {
		String hql = "update User user set user.user_datetime_access_last=:user_datetime_access_last where user.user_id=:user_id";
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("user_datetime_access_last", CommonUtils.getTimestampNow());
		param.put("user_id", uid);
		return baseDAO.executeHql(hql, param);

	}

	@Override
	public void addUser(User user) {

		baseDAO.save(user);

	}

	@Override
	public User getUserById(long uid) {

		return baseDAO.get("from User where userId=?", new Object[] { uid });

	}

	@Override
	public User getUserByPhone(long phoneNum) {

		return baseDAO.get("from User where userPhone=?",
				new Object[] { phoneNum });

	}

}
