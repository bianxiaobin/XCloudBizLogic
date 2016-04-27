package com.xc.bl.app.service;

import com.xc.bl.entities.AppUpd;


public interface IAppUpdInfoService {
	
	public AppUpd getAppUpdLastByAppId(int id);
	
	//======================================
	
	public void addAppUpd(AppUpd appUpd);
}
