package com.xc.bl.tapp.dao;

import com.xc.bl.entities.TappPhoneAndroid;

public interface ITappAndroidDao {
	public void  addTappAndroid(TappPhoneAndroid tappPhoneAndorid);
	public TappPhoneAndroid getById(int id);
	public TappPhoneAndroid getByVercode(int vc);
	public TappPhoneAndroid getLastVer();
}
