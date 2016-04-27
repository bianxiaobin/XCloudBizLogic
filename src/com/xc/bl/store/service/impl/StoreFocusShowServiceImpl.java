package com.xc.bl.store.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.entities.StoreFocusShow;
import com.xc.bl.store.dao.IStoreFocusShowDao;
import com.xc.bl.store.service.IStoreFocusShowService;


@Service("storeFocusShowService")
public class StoreFocusShowServiceImpl implements IStoreFocusShowService{

	@Autowired
	private IStoreFocusShowDao storeFocusShowDao;
	
	@Override
	public List<StoreFocusShow> getStoreFocusShowList() {

		return storeFocusShowDao.getStoreFocusShowList();

	}
	
}
