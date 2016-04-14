package com.xc.bl.map.service;

import com.xc.bl.pojo.MapUpd;


public interface IMapUpdInfo {

	public MapUpd getMapUpdById(long id);
	
	public MapUpd getMapUpdLastByMapId(int id);
	
	public void addMapUpd(MapUpd mapUpd);
	
}
