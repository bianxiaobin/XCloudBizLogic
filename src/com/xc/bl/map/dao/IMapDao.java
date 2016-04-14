package com.xc.bl.map.dao;

import java.util.List;

import com.xc.bl.pojo.Map;



public interface IMapDao {
	public List<Map> getMapByProvinceId(int pid);
}
