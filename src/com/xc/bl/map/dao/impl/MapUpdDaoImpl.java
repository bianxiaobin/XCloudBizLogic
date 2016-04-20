package com.xc.bl.map.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xc.bl.entities.MapUpd;
import com.xc.bl.entities.dao.IBaseDAO;
import com.xc.bl.map.dao.IMapUpdDao;



@Repository("mapUpdDao")
public class MapUpdDaoImpl implements IMapUpdDao{

	@Autowired
	private IBaseDAO<MapUpd> baseDAO;
	
	@Override
	public MapUpd getMapUpdLastByMapId(int id) {
		// TODO Auto-generated method stub
		String hql="from  MapUpd WHERE mapId=:mapId ORDER BY mapUpdId DESC";
		Map<String,Object> param=new HashMap<String,Object>();
		param.put("mapId", id);
		return baseDAO.get(hql, param);
		
		
//		Session session=HibernateSessionFactory.getSession();
//		Query query=session.createQuery(hql);
//		query.setInteger("mapId", id);
//		query.setMaxResults(1);
//		List<MapUpd> mapUpd_list=query.list();
//		if(mapUpd_list==null || mapUpd_list.isEmpty()){
//			return null;
//		}
//		return mapUpd_list.get(0);
	}

	@Override
	public MapUpd getMapUpdById(long id) {

		return baseDAO.get("from MapUpd where mapUpdId=?",new Object[]{id});
		
//		MapUpdDAO mapUpdDao=new MapUpdDAO();
//		return mapUpdDao.findById(id);
	}

	@Override
	public void addMapUpd(MapUpd mapUpd) {
		
		baseDAO.save(mapUpd);
		
//		Session session=HibernateSessionFactory.getSession();
//		Transaction tx=session.beginTransaction();
//		try{
//			MapUpdDAO mapUpdDao=new MapUpdDAO();
//			mapUpdDao.save(mapUpd);
//			tx.commit();
//		}
//		catch(Exception ex){
//			tx.rollback();
//		}
//		finally{
//			session.close();
//		}
	}
}
