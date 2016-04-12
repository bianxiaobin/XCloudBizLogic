package com.xc.bl.car.dao;


import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.annotations.Type;
import org.hibernate.metamodel.binding.HibernateTypeDescriptor;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import com.xc.bl.car.pojo.CarGradeAllInfoMd;
import com.xc.bl.car.pojo.CarGradeAllInfoPo;
import com.xc.bl.car.pojo.CarGradeAllInfoPo_tmp;
import com.xc.bl.pojo.CarBrand;
import com.xc.bl.pojo.CarFactory;
import com.xc.bl.pojo.CarGrade;
import com.xc.bl.pojo.CarModel;
import com.xc.bl.pojo.HibernateSessionFactory;

public class CarGradeDaoImpl implements ICarGradeDao{
	private static Logger logger=Logger.getLogger(CarGradeDaoImpl.class);
	@Override
	public CarGrade getCarGradeByUnique(String cgname, int cgy, String cge,
			int cmid) {
		String hql="from CarGrade where carGradeName=:carGradeName and carGradeYear=:carGradeYear and carGradeEmissions=:carGradeEmissions and carModelId=:carModelId";
		Session session=HibernateSessionFactory.getSession();
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
	}

	@Override
	public CarGradeAllInfoPo getCarGradeAllInfoById(int cgid) {
		CarGradeAllInfoPo carGradeAllInfoPo=null;
		String sql="SELECT {cb.*},{cf.*},{cm.*},{cg.*} FROM car_grade AS cg "
				+ "LEFT JOIN car_model AS cm ON cm.`car_model_id`=cg.`car_model_id` "
				+ "LEFT JOIN car_factory AS cf ON cf.`car_factory_id`=cm.`car_factory_id` "
				+ "LEFT JOIN car_brand AS cb ON cb.`car_brand_id`=cf.`car_brand_id` "
				+ "WHERE cg.`car_grade_id`=:car_grade_id";
		Session session =HibernateSessionFactory.getSession();
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
}
