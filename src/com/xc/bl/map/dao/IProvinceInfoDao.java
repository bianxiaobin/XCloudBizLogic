package com.xc.bl.map.dao;

import java.util.List;

import com.xc.bl.entities.Province;

public interface IProvinceInfoDao {
	
	
	//=============================================
	
	public Province getProvinceById(int pid);
	
	public List<Province> getAllProvince();
	
	public void addProvince(Province province);
	
	public Province getProvinceByName(String pname);
}
