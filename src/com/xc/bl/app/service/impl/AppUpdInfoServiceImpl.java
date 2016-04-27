package com.xc.bl.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.app.dao.IAppUpdInfoDao;
import com.xc.bl.app.service.IAppUpdInfoService;
import com.xc.bl.entities.AppUpd;

@Service("appUpdInfoService")
public class AppUpdInfoServiceImpl implements IAppUpdInfoService {

	@Autowired
	private IAppUpdInfoDao appUpdInfoDao;

	@Override
	public AppUpd getAppUpdLastByAppId(int id) {
		return appUpdInfoDao.getAppUpdLastByAppId(id);
	}

	@Override
	public void addAppUpd(AppUpd appUpd) {
		appUpdInfoDao.addAppUpd(appUpd);

	}

}
