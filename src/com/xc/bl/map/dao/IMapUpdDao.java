package com.xc.bl.map.dao;

import com.xc.bl.entities.MapUpd;

public interface IMapUpdDao {
	
	public MapUpd getMapUpdLastByMapId(int id);
	
	//==========================================
	
	
	public MapUpd getMapUpdById(long id);
	
	public void addMapUpd(MapUpd mapUpd);
}
