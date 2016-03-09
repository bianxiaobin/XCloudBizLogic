package com.xc.bl.car.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.xc.bl.pojo.CarBrand;
import com.xc.bl.pojo.HibernateSessionFactory;

public class CarBrandDaoImpl implements ICarBrandDao{

	@Override
	public List<CarBrand> getCarBrandList(int type, int maxCount) {
		// TODO Auto-generated method stub
		String hql = "";
		if (type != 0) {
			hql = "from CarBrand where carBrandIshot=:carBrandIshot order by car_brand_name_letter ASC limit :maxCount";
		} else {
			hql = "from CarBrand  order by car_brand_name_letter ASC limit :maxCount";
		}
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery(hql);
		if (type != 0) {
			query.setInteger("carBrandIshot", type);
		}
		query.setInteger("maxCount", maxCount);
		List<CarBrand> cb_list = query.list();
		if (cb_list == null || cb_list.isEmpty()) {
			return null;
		}
		return cb_list;
	}
	
}
