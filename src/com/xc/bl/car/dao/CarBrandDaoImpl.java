package com.xc.bl.car.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.xc.bl.pojo.CarBrand;
import com.xc.bl.pojo.HibernateSessionFactory;
import com.xc.bl.utils.CommonDefine.BrandType;

public class CarBrandDaoImpl implements ICarBrandDao {

	@Override
	public List<CarBrand> getCarBrandList1(BrandType type, int maxCount) {

		String hql = "";
		if (type != BrandType.ALL) {
			hql = "from CarBrand where carBrandIshot=:carBrandIshot order by carBrandNameLetter ASC";
		} else {
			hql = "from CarBrand order by carBrandNameLetter ASC ";
		}
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery(hql);
		if (type != BrandType.ALL) {
			query.setInteger("carBrandIshot", type.ordinal());
		}
		query.setMaxResults(maxCount);
		List<CarBrand> cb_list = query.list();
		if (cb_list == null || cb_list.isEmpty()) {
			return null;
		}
		return cb_list;
	}
}
