package com.xc.bl.app.dao;

import java.util.List;

import com.xc.bl.entities.App;
import com.xc.bl.utils.CommonDefine.AppPushType;

public interface IAppInfoDao {

	
	public List<App> getAppListByIspush(AppPushType pt);

	// ==============================================

	public App getAppById(int id);

	public void addApp(App app);
}
