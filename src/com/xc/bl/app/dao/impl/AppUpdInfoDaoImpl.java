package com.xc.bl.app.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xc.bl.app.dao.IAppUpdInfoDao;
import com.xc.bl.entities.App;
import com.xc.bl.entities.AppUpd;
import com.xc.bl.entities.dao.IBaseDAO;



@Repository("appUpdInfoDao")
public class AppUpdInfoDaoImpl implements IAppUpdInfoDao{
	
	@Autowired
	private IBaseDAO<AppUpd> baseDAO;
	
	@Override
	public AppUpd getAppUpdLastByAppId(int id) {
		String hql="FROM AppUpd WHERE appId=:appId ORDER BY appUpdId DESC";		
		Map<String,Object> param=new HashMap<String,Object>();
		param.put("appId", id);
		return baseDAO.get(hql, param);
		
//		String hql="FROM AppUpd WHERE appId=:appId ORDER BY appUpdId DESC";
//		Session session=sessionFactory.getCurrentSession();
//		Query query=session.createQuery(hql);
//		query.setInteger("appId", id);
//		query.setMaxResults(1);
//		List<AppUpd> appUpd_list=query.list();
//		if(appUpd_list.isEmpty()){
//			return null;
//		}
//		return appUpd_list.get(0);
	}

	@Override
	public void addAppUpd(AppUpd appUpd) {
		baseDAO.save(appUpd);
	}



}
