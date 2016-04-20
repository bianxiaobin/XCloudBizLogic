package com.xc.bl.app.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xc.bl.app.dao.IAppInfoDao;
import com.xc.bl.entities.App;
import com.xc.bl.entities.dao.IBaseDAO;

@Repository("appInfoDao")
public class AppInfoDaoImpl implements IAppInfoDao {

	@Autowired
	private IBaseDAO<App> baseDAO;
	
	@Override
	public List<App> getAppListByIspush(short ispush) {
		String hql="from App where appIspush=?";
		List<Object> obj_list=new ArrayList<Object>();
		obj_list.add(ispush);
		return baseDAO.find(hql,obj_list);
	}

	@Override
	public App getAppById(int id) {
		return baseDAO.get("from App where appId=?",new Object[]{id});
	}

	@Override
	public void addApp(App app) {
		baseDAO.save(app);
	}

}
