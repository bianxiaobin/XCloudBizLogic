package com.xc.bl.map.dao;

import java.util.List;

import com.xc.bl.entities.MapVoice;

public interface IMapVoiceDao {
	public List<MapVoice> getMapVoiceList();
	public MapVoice getMapVoiceById(int mvId);
}
