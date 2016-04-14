package com.xc.bl.map.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.xc.bl.pojo.HibernateSessionFactory;
import com.xc.bl.pojo.MapUpd;



public class MapUpdDaoImpl implements IMapUpdDao{

	@Override
	public MapUpd getMapUpdLastByMapId(int id) {
		// TODO Auto-generated method stub
		String hql="from  MapUpd WHERE mapId=:mapId ORDER BY mapUpdId DESC";
		Session session=HibernateSessionFactory.getSession();
		Query query=session.createQuery(hql);
		query.setInteger("mapId", id);
		query.setMaxResults(1);
		List<MapUpd> mapUpd_list=query.list();
		if(mapUpd_list==null || mapUpd_list.isEmpty()){
			return null;
		}
		return mapUpd_list.get(0);
	}
}
