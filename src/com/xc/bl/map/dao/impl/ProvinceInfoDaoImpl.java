package com.xc.bl.map.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xc.bl.entities.Province;
import com.xc.bl.entities.dao.IBaseDAO;
import com.xc.bl.map.dao.IProvinceInfoDao;

@Repository("provinceInfoDao")
public class ProvinceInfoDaoImpl implements IProvinceInfoDao {

	@Autowired
	private IBaseDAO<Province> baseDAO;

	@Override
	public Province getProvinceById(int pid) {

		return baseDAO.get("from Province where provinceId=?",
				new Object[] { pid });

	}

	@Override
	public void addProvince(Province province) {

		baseDAO.save(province);

	}

	@Override
	public List<Province> getAllProvince() {

		return baseDAO.find("from Province");

	}

	@Override
	public Province getProvinceByName(String pname) {

		return baseDAO.get("from Province where provinceName",
				new Object[] { pname });

	}
}
