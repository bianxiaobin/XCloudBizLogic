package com.xc.bl.car.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.car.dao.ICarGradeDao;
import com.xc.bl.car.pojo.CarGradeAllInfoPo;
import com.xc.bl.car.service.ICarGradeService;
import com.xc.bl.entities.CarGrade;
import com.xc.bl.utils.SpringUtils;

@Service("carGradeService")
public class CarGradeServiceImpl implements ICarGradeService {

	//@Autowired
	//private IBaseDAO<CarGrade> baseDAO;
	
	@Autowired
	private ICarGradeDao carGradeDao;
	
	@Override
	public CarGrade addCarGrade(CarGrade carGrade) {
		
		return carGradeDao.addCarGrade(carGrade);
		
//		baseDAO.save(carGrade);
//		return carGrade;
//		CarGradeDAO carGradeDao = new CarGradeDAO();
//		Session session = HibernateSessionFactory.getSession();
//		Transaction tx = session.beginTransaction();
//		try {
//			carGradeDao.save(carGrade);
//			tx.commit();
//		} catch (Exception ex) {
//			tx.rollback();
//		} finally {
//			session.close();
//		}
//		return carGrade;
	}

	@Override
	public CarGrade getCarGradeById(int cgid) {
		return carGradeDao.getCarGradeById(cgid);
//		return baseDAO.get("from CarGrade where carGradeId=?", new Object[]{cgid});
//		CarGradeDAO carGradeDao=new CarGradeDAO();
//		return carGradeDao.findById(cgid);
	}

	@Override
	public CarGrade getCarGradeByName(String CGName) {
		return carGradeDao.getCarGradeByName(CGName);
//		return baseDAO.get("from CarGrade where carGradeName=?", new Object[]{CGName});
//		CarGradeDAO carGradeDao=new CarGradeDAO();
//		List<CarGrade> cg_list=carGradeDao.findByCarGradeName(CGName);
//		if(cg_list==null || cg_list.isEmpty()){
//			return null;
//		}
//		return cg_list.get(0);
	}

	@Override
	public List<CarGrade> getCarGradeByCmid(int cmid) {
		
		return carGradeDao.getCarGradeByCmid(cmid);
		//return baseDAO.find("from CarGrade where carModelId=?", new Object[]{cmid});
		
//		CarGradeDAO carGradeDao=new CarGradeDAO();
//		return carGradeDao.findByCarModelId(cmid);
	}


	@Override
	public CarGrade getCarGradeByUnique(String cgname, int cgy, String cge,
			int cmid) {
		
//		String hql="from CarGrade where carGradeName=:carGradeName "
//				+ " and carGradeYear=:carGradeYear "
//				+ " and carGradeEmissions=:carGradeEmissions "
//				+ " and carModelId=:carModelId";
//		Map<String,Object> param=new HashMap<String,Object>();
//		param.put(":carGradeName", cgname);
//		param.put(":carGradeYear", cgy);
//		param.put(":carGradeEmissions", cge);
//		param.put(":carModelId",cmid);
		
		return ((ICarGradeDao)SpringUtils.getBean("carGradeDao")).getCarGradeByUnique(cgname, cgy, cge, cmid);
		
//		ICarGradeDao iCarGradeDao=new CarGradeDaoImpl();
//		return iCarGradeDao.getCarGradeByUnique(cgname, cgy, cge, cmid);
	}

	@Override
	public CarGradeAllInfoPo getCarGradeAllInfoById(int cgid) {
		
		return ((ICarGradeDao)SpringUtils.getBean("carGradeDao")).getCarGradeAllInfoById(cgid);
		
//		ICarGradeDao iCarGradeDao=new CarGradeDaoImpl();
//		return iCarGradeDao.getCarGradeAllInfoById(cgid);
	}
}
