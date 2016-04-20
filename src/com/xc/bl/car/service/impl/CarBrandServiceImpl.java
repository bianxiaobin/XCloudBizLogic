package com.xc.bl.car.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.car.dao.ICarBrandDao;
import com.xc.bl.car.service.ICarBrandService;
import com.xc.bl.entities.CarBrand;
import com.xc.bl.utils.CommonDefine.BrandType;
import com.xc.bl.utils.SpringUtils;

@Service("carBrandService")
public class CarBrandServiceImpl implements ICarBrandService{

	//@Autowired
	//private IBaseDAO<CarBrand> baseDAO;
	
	@Autowired
	private ICarBrandDao carBrandDao;
	
	@Override
	public List<CarBrand> getCarBrandList(BrandType type, int maxCount) {
		//最大返回300
		if(maxCount>300){
			maxCount=300;
		}
		//ICarBrandDao iCarBrandDao=SpringUtils.getBean("carBrandDao");
		return carBrandDao.getCarBrandList(type, maxCount);
	}

	@Override
	public CarBrand addCarBrand(CarBrand carBrand) {
		
		return carBrandDao.addCarBrand(carBrand);
		
//		baseDAO.save(carBrand);
//		return carBrand;
		
//		CarBrandDAO carBrandDao=new CarBrandDAO();
//		Session session=HibernateSessionFactory.getSession();
//		Transaction tx=session.beginTransaction();
//		try{
//			carBrandDao.save(carBrand);
//			tx.commit();
//		}
//		catch(Exception ex){
//			tx.rollback();
//		}
//		finally{
//			session.close();
//		}
//		return carBrand;
	}

	@Override
	public CarBrand getCarBrandById(int cbid) {
		
		return carBrandDao.getCarBrandById(cbid);
		
		//return baseDAO.get("from CarBrand where carBrandId=?", new Object[]{cbid});
		
//		CarBrandDAO carBrandDao=new CarBrandDAO();
//		return carBrandDao.findById(cbid);
	}

	@Override
	public CarBrand getCarBrandByName(String CBName) {
		
		return carBrandDao.getCarBrandByName(CBName);
		
//		return baseDAO.get("from CarBrand where carBrandName=?", new Object[]{CBName});
		
//		CarBrandDAO carBrandDao=new CarBrandDAO();
//		List<CarBrand> cb_list= carBrandDao.findByCarBrandName(CBName);
//		if(cb_list==null || cb_list.isEmpty()){
//			return null;
//		}
//		return cb_list.get(0);
	}
	
}
