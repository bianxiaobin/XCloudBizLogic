package com.xc.bl.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.app.dao.IAppInfoDao;
import com.xc.bl.app.service.IAppInfoService;
import com.xc.bl.entities.App;

@Service("appInfoService")
public class AppInfoServiceImpl implements IAppInfoService{

//	@Autowired
//	private IBaseDAO<App> baseDAO;
	@Autowired
	private IAppInfoDao appInfoDao;
	
	@Override
	public List<App> getAppListByIspush(short ispush) {
		
	return	appInfoDao.getAppListByIspush(ispush);
//		String hql="from App where appIspush=?";
//		List<Object> obj_list=new ArrayList<Object>();
//		obj_list.add(ispush);
//		return baseDAO.find(hql,obj_list);
//		AppDAO appDao=new AppDAO();
//		return appDao.findByAppIspush(ispush);
	}

	@Override
	public App getAppById(int id) {
		
		return appInfoDao.getAppById(id);
		
		//return baseDAO.find("from App where appId=?",new Object[]{id}).get(0);
		
		//AppDAO appDao=new AppDAO();
		//return appDao.findById(id);
	}

	@Override
	public void addApp(App app) {
		
		appInfoDao.addApp(app);
		
//		baseDAO.save(app);
		
//		Session session=HibernateSessionFactory.getSession();
//		Transaction tx=session.beginTransaction();
//		try{
//			AppDAO appDao=new AppDAO();
//			appDao.save(app);
//			tx.commit();
//		}
//		catch(Exception ex){
//			tx.rollback();
//		}
//		finally{
//			session.close();
//		}
	}
}
