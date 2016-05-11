package com.xc.bl.tapp.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xc.bl.entities.TappPhoneAndroid;
import com.xc.bl.entities.dao.IBaseDAO;
import com.xc.bl.tapp.dao.ITappAndroidDao;

@Repository("tappAndroidDao")
public class TappAndroidDaoImpl implements ITappAndroidDao {

	@Autowired
	private IBaseDAO<TappPhoneAndroid> baseDAO;
	
	@Override
	public void addTappAndroid(TappPhoneAndroid tappPhoneAndorid) {
		baseDAO.save(tappPhoneAndorid);
	}

	@Override
	public TappPhoneAndroid getById(int id) {
		return baseDAO.get("from TappPhoneAndroid where tpaId=?", new Object[]{id});
	}

	@Override
	public TappPhoneAndroid getByVercode(int vc) {
		return baseDAO.get("from TappPhoneAndroid where tpaVercode=?", new Object[]{vc});
	}

	@Override
	public TappPhoneAndroid getLastVer() {
		return baseDAO.get("from TappPhoneAndroid order by tpaVercode desc", new Object[]{});
	}

}
