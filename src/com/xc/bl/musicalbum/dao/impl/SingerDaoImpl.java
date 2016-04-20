package com.xc.bl.musicalbum.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xc.bl.entities.Singer;
import com.xc.bl.entities.dao.IBaseDAO;
import com.xc.bl.musicalbum.dao.ISingerDao;

@Repository("singerDao")
public class SingerDaoImpl implements ISingerDao{

	@Autowired
	private IBaseDAO<Singer> baseDAO;
	
	@Override
	public Singer getSingerByName(String name) {
		return baseDAO.get("from Singer where singerId=?", new Object[]{name});
	}

}
