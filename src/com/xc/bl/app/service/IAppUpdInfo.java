package com.xc.bl.app.service;

import com.xc.bl.pojo.AppUpd;


public interface IAppUpdInfo {
	
	public AppUpd getAppUpdLastByAppId(int id);
	
	public void addAppUpd(AppUpd appUpd);
}
