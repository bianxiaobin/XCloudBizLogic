package com.xc.bl.map.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xc.bl.entities.MapUpd;
import com.xc.bl.entities.dao.IBaseDAO;
import com.xc.bl.map.dao.IMapUpdDao;

@Repository("mapUpdDao")
public class MapUpdDaoImpl implements IMapUpdDao {

	@Autowired
	private IBaseDAO<MapUpd> baseDAO;

	@Override
	public MapUpd getMapUpdLastByMapId(int id) {
		String hql = "from  MapUpd WHERE mapId=:mapId ORDER BY mapUpdId DESC";
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("mapId", id);
		return baseDAO.get(hql, param);

	}

	@Override
	public MapUpd getMapUpdById(long id) {
		return baseDAO.get("from MapUpd where mapUpdId=?", new Object[] { id });
	}

	@Override
	public void addMapUpd(MapUpd mapUpd) {
		baseDAO.save(mapUpd);
	}
}
