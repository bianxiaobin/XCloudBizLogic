package com.xc.bl.tapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.entities.TappPhoneAndroid;
import com.xc.bl.tapp.dao.ITappAndroidDao;
import com.xc.bl.tapp.service.ITappAndroidService;


@Service("tappAndroidService")
public class TappAndroidServiceImpl implements ITappAndroidService {

	@Autowired
	private ITappAndroidDao tappAndroidDao;
	
	@Override
	public void addTappAndroid(TappPhoneAndroid tappPhoneAndorid) {
		tappAndroidDao.addTappAndroid(tappPhoneAndorid);
	}

	@Override
	public TappPhoneAndroid getById(int id) {
		return tappAndroidDao.getById(id);
	}

	@Override
	public TappPhoneAndroid getByVercode(int vc) {
		return tappAndroidDao.getByVercode(vc);
	}

	@Override
	public TappPhoneAndroid getLastVer() {
		return tappAndroidDao.getLastVer();
	}

}
