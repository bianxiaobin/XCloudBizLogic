package com.xc.bl.user.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xc.bl.entities.UserCarBind;
import com.xc.bl.entities.dao.IBaseDAO;
import com.xc.bl.user.dao.IUserCarBindDao;

@Repository("userCarBindDao")
public class UserCarBindDaoImpl implements IUserCarBindDao {

	@Autowired
	private IBaseDAO<UserCarBind> baseDAO;

	@Override
	public void addUserCarBind(UserCarBind ucb) {

		baseDAO.save(ucb);
	}

	@Override
	public List<UserCarBind> getUserCarBindByUid(long uid) {

		return baseDAO.find("from UserCarBind where userId=?",
				new Object[] { uid });

	}

	@Override
	public UserCarBind getUserCarBindById(long ubid) {

		return baseDAO.get("from UserCarBind where ucbId=?",
				new Object[] { ubid });

	}

}
