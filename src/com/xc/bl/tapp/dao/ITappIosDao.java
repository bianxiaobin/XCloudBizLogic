package com.xc.bl.tapp.dao;

import com.xc.bl.entities.TappPhoneAndroid;
import com.xc.bl.entities.TappPhoneIos;

public interface ITappIosDao {
	
	public void  addTappIos(TappPhoneIos tappPhoneIos);
	public TappPhoneIos getById(int id);
	public TappPhoneIos getByVercode(int vc);
	public TappPhoneIos getLastVer();
}
