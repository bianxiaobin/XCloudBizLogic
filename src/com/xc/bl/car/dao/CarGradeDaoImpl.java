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

import com.xc.bl.car.po.CarGradeAllInfoMd;
import com.xc.bl.car.po.CarGradeAllInfoPo;
import com.xc.bl.car.po.CarGradeAllInfoPo_tmp;
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
		Transaction tx=session.beginTransaction();
		try{
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
		}
		catch(Exception e){
			tx.rollback();
		}
		finally{
			session.close();
		}
		return null;
	}

	@Override
	public CarGradeAllInfoPo getCarGradeAllInfoById(int cgid) {
		CarGradeAllInfoPo carGradeAllInfoPo=null;
		/*
		String sql="SELECT cg.car_grade_id AS cgid,cg.car_grade_name AS cgname,cg.car_grade_year AS cgy,cg.`car_grade_emissions` AS cge,cg.`car_grade_si` AS cgsi, "
				+ "cm.`car_model_id` AS cmid,cm.`car_model_name` AS cmname,cm.`car_model_si` AS cmsi, "
				+ "cf.`car_factory_id` AS cfid,cf.`car_factory_name` AS cfname, "
				+ "cb.`car_brand_id` AS cbid,cb.`car_brand_name` AS cbname,cb.`car_brand_ishot` AS cbishot,cb.`car_brand_name_letter` AS cbletter,cb.`car_brand_logo` AS cblogo "
				+ "FROM car_grade AS cg ";
		sql+="LEFT JOIN car_model AS cm ON cm.car_model_id=cg.car_model_id ";
		sql+="LEFT JOIN car_factory AS cf ON cf.car_factory_id=cm.car_factory_id ";
		sql+="LEFT JOIN car_brand AS cb ON cb.car_brand_id=cf.car_brand_id ";
		sql+="WHERE cg.car_grade_id=:car_grade_id";
		
		String sql2="SELECT cg.* FROM car_grade AS cg "
				+ "LEFT JOIN car_model AS cm ON cm.`car_model_id`=cg.`car_model_id` "
				+ "LEFT JOIN car_factory AS cf ON cf.`car_factory_id`=cm.`car_factory_id` "
				+ "LEFT JOIN car_brand AS cb ON cb.`car_brand_id`=cf.`car_brand_id` "
				+ "WHERE cg.`car_grade_id`=1";
		*/
		String sql="SELECT {cb.*},{cf.*},{cm.*},{cg.*} FROM car_grade AS cg "
				+ "LEFT JOIN car_model AS cm ON cm.`car_model_id`=cg.`car_model_id` "
				+ "LEFT JOIN car_factory AS cf ON cf.`car_factory_id`=cm.`car_factory_id` "
				+ "LEFT JOIN car_brand AS cb ON cb.`car_brand_id`=cf.`car_brand_id` "
				+ "WHERE cg.`car_grade_id`=:car_grade_id";
		
		Session session =HibernateSessionFactory.getSession();
		//Query query=session.createSQLQuery(sql).addEntity(CarGradeAllInfoMd.class);
		Query query=session.createSQLQuery(sql)
				.addEntity("cb",CarBrand.class)
				.addEntity("cf",CarFactory.class)
				.addEntity("cm", CarModel.class)
				.addEntity("cg", CarGrade.class);
//				.addScalar("car_grade_id",StandardBasicTypes.INTEGER)
//				.addScalar("car_grade_name", StandardBasicTypes.STRING)
				//.addEntity("cg",CarGradeAllInfoPo_tmp.class);
				//.setResultTransformer(Transformers.aliasToBean(CarGradeAllInfoPo_tmp.class));
		query.setInteger("car_grade_id", cgid);
		query.setMaxResults(1);
		List<Object> obj_list=query.list();
		if(obj_list!=null && !obj_list.isEmpty()){
			 carGradeAllInfoPo=new CarGradeAllInfoPo();
			carGradeAllInfoPo.setCb((CarBrand)((Object[])obj_list.get(0))[0]);
			carGradeAllInfoPo.setCf((CarFactory)((Object[])obj_list.get(0))[1]);
			carGradeAllInfoPo.setCm((CarModel)((Object[])obj_list.get(0))[2]);
			carGradeAllInfoPo.setCg((CarGrade)((Object[])obj_list.get(0))[3]);
			
		}
		
		
//		Iterator iter=obj_list.iterator();
//		while(iter.hasNext()){
//			Object[] o=(Object[]) iter.next();
//			carGradeAllInfoPo=new CarGradeAllInfoPo();
//			carGradeAllInfoPo.setCb((CarBrand)o[0]);
//			carGradeAllInfoPo.setCf((CarFactory)o[1]);
//			carGradeAllInfoPo.setCm((CarModel)o[2]);
//			carGradeAllInfoPo.setCg((CarGrade)o[3]);
////			CarBrand cb=(CarBrand)o[0];
////			CarFactory cf=(CarFactory)o[1];
////			CarModel cm=(CarModel)o[2];
////			CarGrade cg=(CarGrade)o[3];
//			
//			//logger.debug("CarGrade All Info -> "+cg.getCarGradeId()+"  "+cg.getCarGradeName()+" "+cm.getCarModelName());
//		}
		
//		if(obj_list!=null && !obj_list.isEmpty()){
//			for(CarGradeAllInfoPo_tmp cgai : obj_list){
//				logger.debug("CarGrade All Info -> "+cgai.getCar_grade_id()+"  "+cgai.getCar_grade_name());
//			}
//		}
		return carGradeAllInfoPo;
	}

}
