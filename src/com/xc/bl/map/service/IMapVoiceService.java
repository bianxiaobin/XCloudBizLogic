package com.xc.bl.map.service;

import java.util.List;

import com.xc.bl.entities.MapVoice;

public interface IMapVoiceService {
	public List<MapVoice> getMapVoiceList();
	public MapVoice getMapVoiceById(int mvId);
}
