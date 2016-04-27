package com.xc.bl.map.service;

import com.xc.bl.entities.MapUpd;

public interface IMapUpdInfoService {

	public MapUpd getMapUpdById(long id);

	public MapUpd getMapUpdLastByMapId(int id);

	public void addMapUpd(MapUpd mapUpd);

}
