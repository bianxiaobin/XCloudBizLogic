package com.xc.bl.tapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.entities.TappPhoneIos;
import com.xc.bl.tapp.dao.ITappIosDao;
import com.xc.bl.tapp.service.ITappIosService;

@Service("tappIosService")
public class TappIosServiceImpl implements ITappIosService {

	@Autowired
	private ITappIosDao tappIosDao;
	
	@Override
	public void addTappIos(TappPhoneIos tappPhoneIos) {
		tappIosDao.addTappIos(tappPhoneIos);
	}

	@Override
	public TappPhoneIos getById(int id) {
		return tappIosDao.getById(id);
	}

	@Override
	public TappPhoneIos getByVercode(int vc) {
		return tappIosDao.getByVercode(vc);
	}

	@Override
	public TappPhoneIos getLastVer() {
		return tappIosDao.getLastVer();
	}
	
}
