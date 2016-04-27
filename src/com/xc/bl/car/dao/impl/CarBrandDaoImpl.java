package com.xc.bl.car.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xc.bl.car.dao.ICarBrandDao;
import com.xc.bl.entities.CarBrand;
import com.xc.bl.entities.dao.IBaseDAO;
import com.xc.bl.utils.CommonDefine.BrandType;

@Repository("carBrandDao")
public class CarBrandDaoImpl implements ICarBrandDao {

	@Autowired
	private IBaseDAO<CarBrand> baseDAO;

	@Override
	public List<CarBrand> getCarBrandList(BrandType type, int maxCount) {

		if (type == BrandType.ALL) {
			return baseDAO
					.find("from CarBrand order by carBrandNameLetter ASC");
		}

		String hql = "from CarBrand where carBrandIshot=:carBrandIshot order by carBrandNameLetter ASC";
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("carBrandIshot", type.getValue());
		return baseDAO.find(hql, param);

	}

	@Override
	public void addCarBrand(CarBrand carBrand) {
		baseDAO.save(carBrand);
	}

	@Override
	public CarBrand getCarBrandById(int cbid) {
		return baseDAO.get("from CarBrand where carBrandId=?",
				new Object[] { cbid });
	}

	@Override
	public CarBrand getCarBrandByName(String CBName) {
		return baseDAO.get("from CarBrand where carBrandName=?",
				new Object[] { CBName });
	}
}
