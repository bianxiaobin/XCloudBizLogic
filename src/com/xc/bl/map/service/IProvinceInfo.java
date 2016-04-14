package com.xc.bl.map.service;

import java.util.List;

import com.xc.bl.pojo.Province;



public interface IProvinceInfo {
	
	public Province getProvinceById(int pid);
	
	public List<Province> getAllProvince();
	
	public void addProvince(Province province);
	
	public Province getProvinceByName(String pname);
}
