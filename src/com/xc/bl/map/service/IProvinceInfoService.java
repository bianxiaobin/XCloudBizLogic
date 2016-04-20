package com.xc.bl.map.service;

import java.util.List;

import com.xc.bl.entities.Province;

public interface IProvinceInfoService {
	
	public Province getProvinceById(int pid);
	
	public List<Province> getAllProvince();
	
	public void addProvince(Province province);
	
	public Province getProvinceByName(String pname);
}
