package com.xc.bl.car.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xc.bl.car.dao.ICarBrandDao;
import com.xc.bl.entities.CarBrand;
import com.xc.bl.entities.dao.IBaseDAO;
import com.xc.bl.entities.dao.impl.BaseDAOImpl;
import com.xc.bl.utils.CommonDefine.BrandType;


@Repository("carBrandDao")
public class CarBrandDaoImpl implements ICarBrandDao {

	@Autowired
	private IBaseDAO<CarBrand> baseDAO;
	
	@Override
	public List<CarBrand> getCarBrandList(BrandType type, int maxCount) {

		String hql = "";
		if (type != BrandType.ALL) {
			hql = "from CarBrand where carBrandIshot=:carBrandIshot order by carBrandNameLetter ASC";
			Map<String,Object> param=new HashMap<String,Object>();
			param.put("carBrandIshot", (short)type.ordinal());
			return baseDAO.find(hql, param);
		} else {
			hql = "from CarBrand order by carBrandNameLetter ASC ";
			return baseDAO.find(hql);
		}
		


//		String hql = "";
//		if (type != BrandType.ALL) {
//			hql = "from CarBrand where carBrandIshot=:carBrandIshot order by carBrandNameLetter ASC";
//		} else {
//			hql = "from CarBrand order by carBrandNameLetter ASC ";
//		}
//		Session session = HibernateSessionFactory.getSession();
//		Query query = session.createQuery(hql);
//		if (type != BrandType.ALL) {
//			query.setInteger("carBrandIshot", type.ordinal());
//		}
//		query.setMaxResults(maxCount);
//		List<CarBrand> cb_list = query.list();
//		if (cb_list == null || cb_list.isEmpty()) {
//			return null;
//		}
//		return cb_list;
	}

	@Override
	public CarBrand addCarBrand(CarBrand carBrand) {
		baseDAO.save(carBrand);
		return carBrand;
	}

	@Override
	public CarBrand getCarBrandById(int cbid) {
		return baseDAO.get("from CarBrand where carBrandId=?", new Object[]{cbid});
	}

	@Override
	public CarBrand getCarBrandByName(String CBName) {
		return baseDAO.get("from CarBrand where carBrandName=?", new Object[]{CBName});
	}
}
