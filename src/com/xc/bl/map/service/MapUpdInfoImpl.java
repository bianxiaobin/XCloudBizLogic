package com.xc.bl.map.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xc.bl.map.dao.IMapUpdDao;
import com.xc.bl.map.dao.MapUpdDaoImpl;
import com.xc.bl.pojo.HibernateSessionFactory;
import com.xc.bl.pojo.MapUpd;
import com.xc.bl.pojo.MapUpdDAO;

public class MapUpdInfoImpl implements IMapUpdInfo{

	@Override
	public MapUpd getMapUpdById(long id) {
		// TODO Auto-generated method stub
		MapUpdDAO mapUpdDao=new MapUpdDAO();
		return mapUpdDao.findById(id);
	}

	@Override
	public MapUpd getMapUpdLastByMapId(int id) {
		// TODO Auto-generated method stub
		IMapUpdDao iMapUpdDao=new MapUpdDaoImpl();
		return iMapUpdDao.getMapUpdLastByMapId(id);
	}

	@Override
	public void addMapUpd(MapUpd mapUpd) {
		// TODO Auto-generated method stub
		Session session=HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
		try{
			MapUpdDAO mapUpdDao=new MapUpdDAO();
			mapUpdDao.save(mapUpd);
			tx.commit();
		}
		catch(Exception ex){
			tx.rollback();
		}
		finally{
			session.close();
		}
	}
	
}
