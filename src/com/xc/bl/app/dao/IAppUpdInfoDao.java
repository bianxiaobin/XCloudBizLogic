package com.xc.bl.app.dao;

import java.util.List;

import com.xc.bl.entities.App;
import com.xc.bl.entities.AppUpd;

public interface IAppUpdInfoDao {
	
	public AppUpd getAppUpdLastByAppId(int id);
	
	//============================================
	
	public void addAppUpd(AppUpd appUpd);
	
}
