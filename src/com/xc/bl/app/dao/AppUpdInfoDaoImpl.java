package com.xc.bl.app.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.xc.bl.pojo.AppUpd;
import com.xc.bl.pojo.HibernateSessionFactory;


public class AppUpdInfoDaoImpl implements IAppUpdInfoDao{

	@Override
	public AppUpd getAppUpdLastByAppId(int id) {
		// TODO Auto-generated method stub
		String hql="FROM AppUpd WHERE appId=:appId ORDER BY appUpdId DESC";
		Session session=HibernateSessionFactory.getSession();
		Query query=session.createQuery(hql);
		query.setInteger("appId", id);
		query.setMaxResults(1);
		List<AppUpd> appUpd_list=query.list();
		if(appUpd_list.isEmpty()){
			return null;
		}
		return appUpd_list.get(0);
	}

}
