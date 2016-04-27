package com.xc.bl.app.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xc.bl.app.dao.IAppUpdInfoDao;
import com.xc.bl.entities.AppUpd;
import com.xc.bl.entities.dao.IBaseDAO;

@Repository("appUpdInfoDao")
public class AppUpdInfoDaoImpl implements IAppUpdInfoDao {

	@Autowired
	private IBaseDAO<AppUpd> baseDAO;

	@Override
	public AppUpd getAppUpdLastByAppId(int id) {
		String hql = "FROM AppUpd WHERE appId=:appId ORDER BY appUpdId DESC";
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("appId", id);
		return baseDAO.get(hql, param);
	}

	@Override
	public void addAppUpd(AppUpd appUpd) {
		baseDAO.save(appUpd);
	}

}
