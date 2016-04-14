package com.xc.bl.map.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xc.bl.pojo.HibernateSessionFactory;
import com.xc.bl.pojo.Map;
import com.xc.bl.pojo.MapDAO;

public class MapInfoImpl implements IMapInfo{

	@Override
	public List<Map> getAllMaps() {
		// TODO Auto-generated method stub
		MapDAO mapDao=new MapDAO();
		return mapDao.findAll();
	}

	@Override
	public Map getMapById(int id) {
		// TODO Auto-generated method stub
		MapDAO mapDao=new MapDAO();
		return mapDao.findById(id);
	}

	@Override
	public List<Map> getMapByProvinceId(int pid) {
		// TODO Auto-generated method stub
		MapDAO mapDao=new MapDAO();
		return mapDao.findByProvinceId(pid);
//		IMapDao iMapDao=new MapDaoImpl();
//		return iMapDao.getMapByProvinceId(pid);
	}
	
	@Override
	public void addMap(Map map) {
		// TODO Auto-generated method stub
		Session session=HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
		try{
			MapDAO mapDao=new MapDAO();
			mapDao.save(map);
			tx.commit();
		}
		catch(Exception ex){
			tx.rollback();
		}
		finally{
			session.close();
		}
	}

	@Override
	public List<Map> getMapByName(String mname) {
		// TODO Auto-generated method stub
		MapDAO mapDao=new MapDAO();
		return mapDao.findByMapName(mname);
	}
}
