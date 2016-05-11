package com.xc.bl.tapp.service;

import org.springframework.stereotype.Service;

import com.xc.bl.entities.TappPhoneAndroid;


public interface ITappAndroidService {
	public void  addTappAndroid(TappPhoneAndroid tappPhoneAndorid);
	public TappPhoneAndroid getById(int id);
	public TappPhoneAndroid getByVercode(int vc);
	public TappPhoneAndroid getLastVer();
}
