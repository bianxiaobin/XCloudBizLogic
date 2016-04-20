package com.xc.bl.musicalbum.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.entities.Singer;
import com.xc.bl.musicalbum.dao.ISingerDao;
import com.xc.bl.musicalbum.service.ISingerService;

@Service("singerService")
public class SingerServiceImpl implements ISingerService{

	@Autowired
	private ISingerDao  singerDao;
	
	@Override
	public Singer getSingerByName(String name) {
		return singerDao.getSingerByName(name);
	}

}
