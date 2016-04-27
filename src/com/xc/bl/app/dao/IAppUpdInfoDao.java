package com.xc.bl.app.dao;

import com.xc.bl.entities.AppUpd;

public interface IAppUpdInfoDao {

	public AppUpd getAppUpdLastByAppId(int id);

	// ============================================

	public void addAppUpd(AppUpd appUpd);

}
