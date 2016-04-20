package com.xc.bl.map.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.entities.Map;
import com.xc.bl.map.dao.IMapDao;
import com.xc.bl.map.service.IMapInfoService;


@Service("mapInfoService")
public class MapInfoServiceImpl implements IMapInfoService{

//	@Autowired
//	private IBaseDAO<Map> baseDAO;
	
	@Autowired
	private IMapDao mapDao;
	
	@Override
	public List<Map> getAllMaps() {
		
		return mapDao.getAllMaps();
		//return baseDAO.find("from Map");
		
//		MapDAO mapDao=new MapDAO();
//		return mapDao.findAll();
	}

	@Override
	public Map getMapById(int id) {
		
		return mapDao.getMapById(id);
		
//		return baseDAO.get("from Map where mapId=?", new Object[]{id});
		
//		MapDAO mapDao=new MapDAO();
//		return mapDao.findById(id);
	}

	@Override
	public List<Map> getMapByProvinceId(int pid) {
		
		return mapDao.getMapByProvinceId(pid);
//		return baseDAO.find("from Map where provinceId=?",new Object[]{pid});
		
//		MapDAO mapDao=new MapDAO();
//		return mapDao.findByProvinceId(pid);
//		IMapDao iMapDao=new MapDaoImpl();
//		return iMapDao.getMapByProvinceId(pid);
	}
	
	@Override
	public void addMap(Map map) {
		// TODO Auto-generated method stub
		
		mapDao.addMap(map);
//		baseDAO.save(map);
		
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
		
		return mapDao.getMapByName(mname);
//		return baseDAO.find("from Map where mapName=?",new Object[]{mname});
		
//		MapDAO mapDao=new MapDAO();
//		return mapDao.findByMapName(mname);
	}
}
