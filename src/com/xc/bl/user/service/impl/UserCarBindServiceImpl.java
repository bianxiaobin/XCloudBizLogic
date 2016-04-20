package com.xc.bl.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.car.service.ICarInfoService;
import com.xc.bl.entities.Car;
import com.xc.bl.entities.UserCarBind;
import com.xc.bl.user.dao.IUserCarBindDao;
import com.xc.bl.user.dao.IUserLogInfoDao;
import com.xc.bl.user.service.IUserCarBindService;
import com.xc.bl.utils.SpringUtils;

@Service("userCarBindService")
public class UserCarBindServiceImpl implements IUserCarBindService{

//	@Autowired
//	private IBaseDAO<UserCarBind> baseDAO;
//	
	@Autowired
	private IUserCarBindDao userCarBindDao;
	
	@Override
	public UserCarBind addUserCarBind(UserCarBind ucb) {
		return userCarBindDao.addUserCarBind(ucb);
//		baseDAO.save(ucb);
//		return ucb;
		
//		UserCarBindDAO userCarBindDao = new UserCarBindDAO();
//		Session session = HibernateSessionFactory.getSession();
//		Transaction tx = session.getTransaction();
//		try {
//			tx.begin();
//			userCarBindDao.save(ucb);
//			tx.commit();
//		} catch (Exception ex) {
//			tx.rollback();
//		} finally {
//			session.close();
//		}
//		return ucb;
	}

	@Override
	public List<UserCarBind> getUserCarBindByUid(long uid) {
		return userCarBindDao.getUserCarBindByUid(uid);
//		return baseDAO.find("from UserCarBind where userId=?",new Object[]{uid});
		
//		UserCarBindDAO userCarBindDao=new UserCarBindDAO();
//		List<UserCarBind> userCarBind_list=userCarBindDao.findByUserId(uid);
//		return userCarBind_list;
	}

	@Override
	public UserCarBind addUserNewCarBind(long uid, Car car) {
		
		ICarInfoService iCarInfoService=SpringUtils.getBean("carInfoService");
		UserCarBind userCarBind=new UserCarBind();
		userCarBind=new UserCarBind();
		userCarBind.setCarId(car.getCarId());
		userCarBind.setUserId(uid);
		//添加Car
		iCarInfoService.addCar(car);
		//添加User Car绑定关系
		userCarBindDao.addUserCarBind(userCarBind);
		//baseDAO.save(userCarBind);
		
		return userCarBind;
		
		
//		UserCarBindDAO userCarBindDao=new UserCarBindDAO();
//		CarDAO carDao=new CarDAO();
//		UserCarBind userCarBind=null;
//		Session session=HibernateSessionFactory.getSession();
//		Transaction tx=session.getTransaction();
//		try{
//			tx.begin();
//			carDao.save(car);
//			userCarBind=new UserCarBind();
//			userCarBind.setCarId(car.getCarId());
//			userCarBind.setUserId(uid);
//			userCarBindDao.save(userCarBind);
//			tx.commit();
//		}
//		catch(Exception e){
//			tx.rollback();
//		}
//		finally{
//			session.close();
//		}
//		return userCarBind;
	}

	@Override
	public UserCarBind getUserCarBindById(long ubid) {
		return userCarBindDao.getUserCarBindById(ubid);
		
//		return baseDAO.get("from UserCarBind where ucbId=?", new Object[]{ubid});
		
//		UserCarBindDAO userCarBindDao=new UserCarBindDAO();
//		return userCarBindDao.findById(ubid);
	}
}
