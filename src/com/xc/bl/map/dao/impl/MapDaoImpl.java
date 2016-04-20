package com.xc.bl.map.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xc.bl.entities.Map;
import com.xc.bl.entities.dao.IBaseDAO;
import com.xc.bl.map.dao.IMapDao;


@Repository("mapDao")
public class MapDaoImpl implements IMapDao {

	@Autowired
	private IBaseDAO<Map> baseDAO;
	
	@Override
	public List<Map> getMapByProvinceId(int pid) {
		String hql="from Map WHERE provinceId=:provinceId";
		java.util.Map<String,Object> param=new HashMap<String,Object>();
		param.put("provinceId", pid);
		
		return baseDAO.find(hql, param);
		
//		Session session=HibernateSessionFactory.getSession();
//		Query query=session.createQuery(hql);
//		query.setInteger("provinceId", pid);
//		return query.list();
	}

	@Override
	public List<Map> getAllMaps() {
		
		return baseDAO.find("from Map");
		
//		MapDAO mapDao=new MapDAO();
//		return mapDao.findAll();
	}

	@Override
	public Map getMapById(int id) {
		return baseDAO.get("from Map where mapId=?", new Object[]{id});
		
//		MapDAO mapDao=new MapDAO();
//		return mapDao.findById(id);
	}

	@Override
	public void addMap(Map map) {
		// TODO Auto-generated method stub
		
		baseDAO.save(map);
		
//		Session session=HibernateSessionFactory.getSession();
//		Transaction tx=session.beginTransaction();
//		try{
//			MapDAO mapDao=new MapDAO();
//			mapDao.save(map);
//			tx.commit();
//		}
//		catch(Exception ex){
//			tx.rollback();
//		}
//		finally{
//			session.close();
//		}
	}

	@Override
	public List<Map> getMapByName(String mname) {
		
		return baseDAO.find("from Map where mapName=?",new Object[]{mname});
		
//		MapDAO mapDao=new MapDAO();
//		return mapDao.findByMapName(mname);
	}

}
