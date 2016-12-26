package com.xc.bl.map.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xc.bl.entities.MapVoice;
import com.xc.bl.entities.dao.IBaseDAO;
import com.xc.bl.map.dao.IMapVoiceDao;

@Repository(value="mapVoiceDao")
public class MapVoiceDaoImpl implements IMapVoiceDao {
	@Autowired
	private IBaseDAO<MapVoice> baseDAO;
	
	@Override
	public List<MapVoice> getMapVoiceList() {
		return baseDAO.find("from MapVoice");
	}

	@Override
	public MapVoice getMapVoiceById(int mvId) {
		return baseDAO.get("from MapVoice where mvId=?", new Object[]{mvId});
	}
}
