package com.xc.bl.car.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.car.dao.ICarInfoDao;
import com.xc.bl.car.service.ICarInfoService;
import com.xc.bl.entities.Car;

@Service("carInfoService")
public class CarInfoServiceImpl implements ICarInfoService {

//	@Autowired
//	private IBaseDAO<Car> baseDAO;
	
	@Autowired
	private ICarInfoDao carInfoDao;

	@Override
	public Car addCar(Car car) {

		return carInfoDao.addCar(car);
//		baseDAO.save(car);
//		return car;
		// CarDAO carDao = new CarDAO();
		// Session session = HibernateSessionFactory.getSession();
		// Transaction tx = session.beginTransaction();
		// try {
		// carDao.save(car);
		// tx.commit();
		// } catch (Exception ex) {
		// tx.rollback();
		// } finally {
		// session.close();
		// }
		// return car;
	}

	@Override
	public int updCarInfoById(Car car) {
		
		return carInfoDao.updCarInfoById(car);
//		int updCount = 0;
//		try {
//			baseDAO.update(car);
//			updCount = 1;
//		} catch (Exception ex) {
//			updCount = 0;
//		}
//		return updCount;

		// int updCount=0;
		// CarDAO carDao=new CarDAO();
		// Session session=HibernateSessionFactory.getSession();
		// Transaction tx=session.beginTransaction();
		// try{
		// carDao.attachDirty(car);
		// tx.commit();
		// updCount=1;
		// }
		// catch(Exception ex){
		// tx.rollback();
		// }
		// finally{
		// session.close();
		// }
		// return updCount;
	}

	@Override
	public Car getCarById(long cid) {
		
		return carInfoDao.getCarById(cid);
//		return baseDAO.get("from Car where carId=?", new Object[]{cid});
		
//		
//		CarDAO carDao = new CarDAO();
//		return carDao.findById(cid);
	}

}
