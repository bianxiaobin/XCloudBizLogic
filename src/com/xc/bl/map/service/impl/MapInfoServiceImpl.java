package com.xc.bl.map.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.entities.Map;
import com.xc.bl.map.dao.IMapDao;
import com.xc.bl.map.service.IMapInfoService;

@Service("mapInfoService")
public class MapInfoServiceImpl implements IMapInfoService {

	@Autowired
	private IMapDao mapDao;

	@Override
	public List<Map> getAllMaps() {

		return mapDao.getAllMaps();
	}

	@Override
	public Map getMapById(int id) {

		return mapDao.getMapById(id);

	}

	@Override
	public List<Map> getMapByProvinceId(int pid) {

		return mapDao.getMapByProvinceId(pid);
	}

	@Override
	public void addMap(Map map) {

		mapDao.addMap(map);
	}

	@Override
	public List<Map> getMapByName(String mname) {

		return mapDao.getMapByName(mname);
	}
}
