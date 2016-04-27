package com.xc.bl.app.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xc.bl.app.dao.IAppInfoDao;
import com.xc.bl.entities.App;
import com.xc.bl.entities.dao.IBaseDAO;
import com.xc.bl.utils.CommonDefine.AppPushType;

@Repository("appInfoDao")
public class AppInfoDaoImpl implements IAppInfoDao {

	@Autowired
	private IBaseDAO<App> baseDAO;

	@Override
	public List<App> getAppListByIspush(AppPushType pt) {
		if(pt==AppPushType.ALL){
			return baseDAO.find("from App");
		}
		return baseDAO.find("from App where appIspush=?",new Object[]{pt.getValue()});
	}

	@Override
	public App getAppById(int id) {
		return baseDAO.get("from App where appId=?", new Object[] { id });
	}

	@Override
	public void addApp(App app) {
		baseDAO.save(app);
	}
	
}
