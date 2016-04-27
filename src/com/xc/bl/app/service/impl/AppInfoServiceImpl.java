package com.xc.bl.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.app.dao.IAppInfoDao;
import com.xc.bl.app.service.IAppInfoService;
import com.xc.bl.entities.App;
import com.xc.bl.utils.CommonDefine.AppPushType;

@Service("appInfoService")
public class AppInfoServiceImpl implements IAppInfoService {

	@Autowired
	private IAppInfoDao appInfoDao;

	@Override
	public List<App> getAppListByIspush(AppPushType pt) {
		return appInfoDao.getAppListByIspush(pt);
	}

	@Override
	public App getAppById(int id) {
		return appInfoDao.getAppById(id);
	}

	@Override
	public void addApp(App app) {
		appInfoDao.addApp(app);
	}


}
