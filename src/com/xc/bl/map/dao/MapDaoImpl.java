package com.xc.bl.map.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.xc.bl.pojo.HibernateSessionFactory;
import com.xc.bl.pojo.Map;



public class MapDaoImpl implements IMapDao {

	@Override
	public List<Map> getMapByProvinceId(int pid) {
		// TODO Auto-generated method stub
		String hql="from Map WHERE provinceId=:provinceId";
		Session session=HibernateSessionFactory.getSession();
		Query query=session.createQuery(hql);
		query.setInteger("provinceId", pid);
		return query.list();
	}

}
