package com.xc.bl.store.service;

import java.util.List;

import com.xc.bl.pojo.StoreFocusShow;
import com.xc.bl.pojo.StoreFocusShowDAO;



public class StoreFocusShowImpl implements IStoreFocusShow{

	@Override
	public List<StoreFocusShow> getStoreFocusShowList() {
		// TODO Auto-generated method stub
		StoreFocusShowDAO storeFocusShowDAO=new StoreFocusShowDAO();
		List<StoreFocusShow> store_fs_list=storeFocusShowDAO.findAll();
		return store_fs_list;
	}
	
}
