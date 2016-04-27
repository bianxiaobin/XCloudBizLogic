package com.xc.bl.map.dao.impl;

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
		return baseDAO
				.find("from Map WHERE provinceId=?", new Object[] { pid });
	}

	@Override
	public List<Map> getAllMaps() {
		return baseDAO.find("from Map");
	}

	@Override
	public Map getMapById(int id) {
		return baseDAO.get("from Map where mapId=?", new Object[] { id });

	}

	@Override
	public void addMap(Map map) {

		baseDAO.save(map);

	}

	@Override
	public List<Map> getMapByName(String mname) {

		return baseDAO.find("from Map where mapName=?", new Object[] { mname });

	}

}
