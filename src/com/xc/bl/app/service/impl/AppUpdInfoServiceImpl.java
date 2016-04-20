package com.xc.bl.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.app.dao.IAppUpdInfoDao;
import com.xc.bl.app.dao.impl.AppUpdInfoDaoImpl;
import com.xc.bl.app.service.IAppUpdInfoService;
import com.xc.bl.entities.AppUpd;
import com.xc.bl.utils.SpringUtils;

@Service("appUpdInfoService")
public class AppUpdInfoServiceImpl implements IAppUpdInfoService {

	@Autowired
	private IAppUpdInfoDao appUpdInfoDao;

	@Override
	public AppUpd getAppUpdLastByAppId(int id) {
		// IAppUpdInfoDao iAppUpdInfoDao=new AppUpdInfoDaoImpl();
		// iAppUpdInfoDao.getAppUpdLastByAppId(id);

//		return ((AppUpdInfoDaoImpl) SpringUtils.getBean("appUpdInfoDao"))
//				.getAppUpdLastByAppId(id);
		
		return appUpdInfoDao.getAppUpdLastByAppId(id);
	}

	@Override
	public void addAppUpd(AppUpd appUpd) {
		
		appUpdInfoDao.addAppUpd(appUpd);

		// Session session=HibernateSessionFactory.getSession();
		// Transaction tx=session.beginTransaction();
		// try{
		// AppUpdDAO appUpdDao=new AppUpdDAO();
		// appUpdDao.save(appUpd);
		// tx.commit();
		// }
		// catch(Exception ex){
		// tx.rollback();
		// }
		// finally{
		// session.close();
		// }
	}

}
