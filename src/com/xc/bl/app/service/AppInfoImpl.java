package com.xc.bl.app.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xc.bl.pojo.App;
import com.xc.bl.pojo.AppDAO;
import com.xc.bl.pojo.HibernateSessionFactory;



public class AppInfoImpl implements IAppInfo{

	@Override
	public List<App> getAppListByIspush(short ispush) {
		// TODO Auto-generated method stub
		AppDAO appDao=new AppDAO();
		return appDao.findByAppIspush(ispush);
	}

	@Override
	public App getAppById(int id) {
		// TODO Auto-generated method stub
		AppDAO appDao=new AppDAO();
		return appDao.findById(id);
	}

	@Override
	public void addApp(App app) {
		// TODO Auto-generated method stub
		Session session=HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
		try{
			AppDAO appDao=new AppDAO();
			appDao.save(app);
			tx.commit();
		}
		catch(Exception ex){
			tx.rollback();
		}
		finally{
			session.close();
		}
	}
}
