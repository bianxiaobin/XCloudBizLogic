package com.xc.bl.store.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.xc.bl.entities.StoreFocusShow;
import com.xc.bl.entities.dao.IBaseDAO;
import com.xc.bl.store.dao.IStoreFocusShowDao;


@Repository("storeFocusShowDao")
public class StoreFocusShowDaoImpl implements IStoreFocusShowDao{

	@Autowired
	private IBaseDAO<StoreFocusShow> baseDAO;
	
	@Override
	public List<StoreFocusShow> getStoreFocusShowList() {

		return baseDAO.find("from StoreFocusShow");
		
//		StoreFocusShowDAO storeFocusShowDAO=new StoreFocusShowDAO();
//		List<StoreFocusShow> store_fs_list=storeFocusShowDAO.findAll();
//		return store_fs_list;
	}
	
}
