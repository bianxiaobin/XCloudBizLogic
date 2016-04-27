package com.xc.bl.map.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.entities.Province;
import com.xc.bl.map.dao.IProvinceInfoDao;
import com.xc.bl.map.service.IProvinceInfoService;

@Service("provinceInfoService")
public class ProvinceInfoServiceImpl implements IProvinceInfoService {

	@Autowired
	private IProvinceInfoDao provinceInfoDao;

	@Override
	public Province getProvinceById(int pid) {

		return provinceInfoDao.getProvinceById(pid);

	}

	@Override
	public void addProvince(Province province) {
		provinceInfoDao.addProvince(province);
	}

	@Override
	public List<Province> getAllProvince() {
		return provinceInfoDao.getAllProvince();

	}

	@Override
	public Province getProvinceByName(String pname) {

		return provinceInfoDao.getProvinceByName(pname);

	}
}
