package com.xc.bl.tapp.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xc.bl.entities.TappPhoneIos;
import com.xc.bl.entities.dao.IBaseDAO;
import com.xc.bl.tapp.dao.ITappIosDao;

@Repository("tappIosDao")
public class TappIosDaoImpl implements ITappIosDao {

	@Autowired
	private IBaseDAO<TappPhoneIos> baseDAO;
	
	@Override
	public void addTappIos(TappPhoneIos tappPhoneIos) {
		baseDAO.save(tappPhoneIos);
	}

	@Override
	public TappPhoneIos getById(int id) {
		return baseDAO.get("from TappPhoneIos where tpiId=?", new Object[]{id});
	}

	@Override
	public TappPhoneIos getByVercode(int vc) {
		return baseDAO.get("from TappPhoneIos where tpiVercode=?", new Object[]{vc});
	}

	@Override
	public TappPhoneIos getLastVer() {
		return baseDAO.get("from TappPhoneIos order by tpiId desc", new Object[]{});
	}

}
