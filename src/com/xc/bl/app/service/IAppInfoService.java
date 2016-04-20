package com.xc.bl.app.service;

import java.util.List;

import com.xc.bl.entities.App;


public interface IAppInfoService {
	
	public List<App> getAppListByIspush(short ispush);
	
	public App getAppById(int id);
	
	public void addApp(App app);
	
}
