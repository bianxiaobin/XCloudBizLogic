package com.xc.bl.tapp.service;

import com.xc.bl.entities.TappPhoneIos;

public interface ITappIosService {
	public void  addTappIos(TappPhoneIos tappPhoneIos);
	public TappPhoneIos getById(int id);
	public TappPhoneIos getByVercode(int vc);
	public TappPhoneIos getLastVer();
}
