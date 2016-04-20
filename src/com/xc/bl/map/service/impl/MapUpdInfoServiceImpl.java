package com.xc.bl.map.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.entities.MapUpd;
import com.xc.bl.map.dao.IMapUpdDao;
import com.xc.bl.map.service.IMapUpdInfoService;
import com.xc.bl.utils.SpringUtils;


@Service("mapUpdInfoService")
public class MapUpdInfoServiceImpl implements IMapUpdInfoService{

//	@Autowired
//	private IBaseDAO<MapUpd> baseDAO;
	
	@Autowired
	private IMapUpdDao mapUpdDao;
	
	@Override
	public MapUpd getMapUpdById(long id) {

		return mapUpdDao.getMapUpdById(id);
//		return baseDAO.get("from MapUpd where mapUpdId=?",new Object[]{id});
		
//		MapUpdDAO mapUpdDao=new MapUpdDAO();
//		return mapUpdDao.findById(id);
	}

	@Override
	public MapUpd getMapUpdLastByMapId(int id) {
		
		return mapUpdDao.getMapUpdLastByMapId(id);
		
//		IMapUpdDao iMapUpdDao=SpringUtils.getBean("mapUpdDao");
//		
//		//IMapUpdDao iMapUpdDao=new MapUpdDaoImpl();
//		return iMapUpdDao.getMapUpdLastByMapId(id);
	}

	@Override
	public void addMapUpd(MapUpd mapUpd) {
		
		mapUpdDao.addMapUpd(mapUpd);
//		baseDAO.save(mapUpd);
		
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
