package com.xc.bl.car.dao.impl;


import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xc.bl.car.dao.ICarGradeDao;
import com.xc.bl.car.pojo.CarGradeAllInfoPo;
import com.xc.bl.entities.CarBrand;
import com.xc.bl.entities.CarFactory;
import com.xc.bl.entities.CarGrade;
import com.xc.bl.entities.CarModel;
import com.xc.bl.entities.dao.IBaseDAO;

@Repository("carGradeDao")
public class CarGradeDaoImpl implements ICarGradeDao{
	
	@Autowired
	private IBaseDAO<CarGrade> baseDAO;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private static Logger logger=Logger.getLogger(CarGradeDaoImpl.class);
	@Override
	public CarGrade getCarGradeByUnique(String cgname, int cgy, String cge,
			int cmid) {
		String hql="from CarGrade where carGradeName=:carGradeName "
				+ "and carGradeYear=:carGradeYear and carGradeEmissions=:carGradeEmissions "
				+ "and carModelId=:carModelId";
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery(hql);
		query.setString("carGradeName", cgname);
		query.setInteger("carGradeYear", cgy);
		query.setString("carGradeEmissions", cge);
		query.setInteger("carModelId", cmid);
		query.setMaxResults(1);
		List<CarGrade> cglist=query.list();
		if(cglist!=null && cglist.size()>0){
			return cglist.get(0);
		}
		return null;
		
//		String hql="from CarGrade where carGradeName=:carGradeName and carGradeYear=:carGradeYear and carGradeEmissions=:carGradeEmissions and carModelId=:carModelId";
//		Session session=HibernateSessionFactory.getSession();
//		Query query=session.createQuery(hql);
//		query.setString("carGradeName", cgname);
//		query.setInteger("carGradeYear", cgy);
//		query.setString("carGradeEmissions", cge);
//		query.setInteger("carModelId", cmid);
//		query.setMaxResults(1);
//		List<CarGrade> cglist=query.list();
//		if(cglist!=null && cglist.size()>0){
//			return cglist.get(0);
//		}
//		return null;
	}

	@Override
	public CarGradeAllInfoPo getCarGradeAllInfoById(int cgid) {
		CarGradeAllInfoPo carGradeAllInfoPo=null;
		String sql="SELECT {cb.*},{cf.*},{cm.*},{cg.*} FROM car_grade AS cg "
				+ "LEFT JOIN car_model AS cm ON cm.`car_model_id`=cg.`car_model_id` "
				+ "LEFT JOIN car_factory AS cf ON cf.`car_factory_id`=cm.`car_factory_id` "
				+ "LEFT JOIN car_brand AS cb ON cb.`car_brand_id`=cf.`car_brand_id` "
				+ "WHERE cg.`car_grade_id`=:car_grade_id";
		Session session =sessionFactory.getCurrentSession();
		Query query=session.createSQLQuery(sql)
				.addEntity("cb",CarBrand.class)
				.addEntity("cf",CarFactory.class)
				.addEntity("cm", CarModel.class)
				.addEntity("cg", CarGrade.class);
		    
		query.setInteger("car_grade_id", cgid);
		query.setMaxResults(1);
		
		List<Object[]> rows=query.list();
		if(rows!=null && !rows.isEmpty()){
			 Object[] row=rows.get(0);
			 carGradeAllInfoPo=new CarGradeAllInfoPo();
			 carGradeAllInfoPo.setCb((CarBrand)row[0]);
			 carGradeAllInfoPo.setCf((CarFactory)row[1]);
			 carGradeAllInfoPo.setCm((CarModel)row[2]);
			 carGradeAllInfoPo.setCg((CarGrade)row[3]);
		}
		return carGradeAllInfoPo;
	}

	@Override
	public CarGrade addCarGrade(CarGrade carGrade) {
		baseDAO.save(carGrade);
		return carGrade;
	}

	@Override
	public CarGrade getCarGradeById(int cgid) {
		return baseDAO.get("from CarGrade where carGradeId=?", new Object[]{cgid});
	}

	@Override
	public CarGrade getCarGradeByName(String CGName) {
		return baseDAO.get("from CarGrade where carGradeName=?", new Object[]{CGName});
	}

	@Override
	public List<CarGrade> getCarGradeByCmid(int cmid) {
		return baseDAO.find("from CarGrade where carModelId=?", new Object[]{cmid});
	}
}
