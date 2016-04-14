package com.xc.bl.app.dao;

import com.xc.bl.pojo.AppUpd;



public interface IAppUpdInfoDao {
	
	public AppUpd getAppUpdLastByAppId(int id);
	
}
