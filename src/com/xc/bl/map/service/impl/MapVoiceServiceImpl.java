package com.xc.bl.map.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.entities.MapVoice;
import com.xc.bl.map.dao.IMapVoiceDao;
import com.xc.bl.map.service.IMapVoiceService;

@Service(value = "mapVoiceService")
public class MapVoiceServiceImpl implements IMapVoiceService{
	@Autowired
	private IMapVoiceDao dao;
	@Override
	public List<MapVoice> getMapVoiceList() {
		return dao.getMapVoiceList();
	}

	@Override
	public MapVoice getMapVoiceById(int mvId) {
		return dao.getMapVoiceById(mvId);
	}
}
