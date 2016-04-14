package com.xc.bl.app.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xc.bl.app.dao.AppUpdInfoDaoImpl;
import com.xc.bl.app.dao.IAppUpdInfoDao;
import com.xc.bl.pojo.AppUpd;
import com.xc.bl.pojo.AppUpdDAO;
import com.xc.bl.pojo.HibernateSessionFactory;



public class AppUpdInfoImpl implements IAppUpdInfo {

	@Override
	public AppUpd getAppUpdLastByAppId(int id) {
		// TODO Auto-generated method stub
		IAppUpdInfoDao iAppUpdInfoDao=new AppUpdInfoDaoImpl();
		return iAppUpdInfoDao.getAppUpdLastByAppId(id);
	}

	@Override
	public void addAppUpd(AppUpd appUpd) {
		// TODO Auto-generated method stub
		Session session=HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
		try{
			AppUpdDAO appUpdDao=new AppUpdDAO();
			appUpdDao.save(appUpd);
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
