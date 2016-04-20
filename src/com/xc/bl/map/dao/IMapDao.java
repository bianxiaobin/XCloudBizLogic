package com.xc.bl.map.dao;

import java.util.List;

import com.xc.bl.entities.Map;

public interface IMapDao {
	public List<Map> getMapByProvinceId(int pid);
	
	//================================================
	public void addMap(Map map);
	
	public List<Map> getMapByName(String mname);
	
	public List<Map> getAllMaps();
	
	public Map getMapById(int id);
}
