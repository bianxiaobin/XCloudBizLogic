package com.xc.bl.car.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.car.dao.ICarFactoryDao;
import com.xc.bl.car.service.ICarFactoryService;
import com.xc.bl.entities.CarFactory;

@Service("carFactoryService")
public class CarFactoryServiceImpl implements ICarFactoryService{

//	@Autowired
//	private IBaseDAO<CarFactory> baseDAO;
	
	@Autowired
	private ICarFactoryDao carFactoryDao;
	
	@Override
	public CarFactory addCarFactory(CarFactory carFactory) {
		
		return carFactoryDao.addCarFactory(carFactory);
		
//		baseDAO.save(carFactory);
//		return carFactory;
//		CarFactoryDAO carFactoryDao=new CarFactoryDAO();
//		Session session=HibernateSessionFactory.getSession();
//		Transaction tx=session.beginTransaction();
//		try{
//			carFactoryDao.save(carFactory);
//			tx.commit();
//		}
//		catch(Exception ex){
//			tx.rollback();
//		}
//		finally{
//			session.close();
//		}
//		return carFactory;
	}

	@Override
	public CarFactory getCarFactoryById(int cfid) {
		
		return carFactoryDao.getCarFactoryById(cfid);
//		return baseDAO.get("from CarFactory where carFactoryId=?", new Object[]{cfid});
//		CarFactoryDAO carFactoryDao=new CarFactoryDAO();
//		return carFactoryDao.findById(cfid);
	}

	@Override
	public CarFactory getCarFactoryByName(String CFName) {
		return carFactoryDao.getCarFactoryByName(CFName);
//		return baseDAO.get("from CarFactory where carFactoryName=?", new Object[]{CFName});
//		CarFactoryDAO carFactoryDao=new CarFactoryDAO();
//		List<CarFactory> cf_list=carFactoryDao.findByCarFactoryName(CFName);
//		if(cf_list==null || cf_list.isEmpty()){
//			return null;
//		}
//		return cf_list.get(0);
	}

	@Override
	public List<CarFactory> getCarFactoryByCbid(int cbid) {
		
		return carFactoryDao.getCarFactoryByCbid(cbid);
//		return baseDAO.find("from CarFactory where carBrandId=?", new Object[]{cbid});
		
//		CarFactoryDAO carFactoryDao=new CarFactoryDAO();
//		List<CarFactory> cf_list=carFactoryDao.findByCarBrandId(cbid);
//		if(cf_list==null || cf_list.isEmpty()){
//			return null;
//		}
//		return cf_list;
	}
	
}
