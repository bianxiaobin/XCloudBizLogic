package com.xc.bl.map.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.entities.MapUpd;
import com.xc.bl.map.dao.IMapUpdDao;
import com.xc.bl.map.service.IMapUpdInfoService;

@Service("mapUpdInfoService")
public class MapUpdInfoServiceImpl implements IMapUpdInfoService {

	@Autowired
	private IMapUpdDao mapUpdDao;

	@Override
	public MapUpd getMapUpdById(long id) {

		return mapUpdDao.getMapUpdById(id);

	}

	@Override
	public MapUpd getMapUpdLastByMapId(int id) {

		return mapUpdDao.getMapUpdLastByMapId(id);

	}

	@Override
	public void addMapUpd(MapUpd mapUpd) {

		mapUpdDao.addMapUpd(mapUpd);
	}

}
