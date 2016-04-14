package com.xc.bl.map.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xc.bl.pojo.HibernateSessionFactory;
import com.xc.bl.pojo.Province;
import com.xc.bl.pojo.ProvinceDAO;



public class ProvinceInfoImpl implements IProvinceInfo {

	@Override
	public Province getProvinceById(int pid) {
		// TODO Auto-generated method stub
		ProvinceDAO provinceDao=new ProvinceDAO();
		return provinceDao.findById(pid);
	}

	@Override
	public void addProvince(Province province) {
		// TODO Auto-generated method stub
		Session session=HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
		try{
			ProvinceDAO provinceDao=new ProvinceDAO();
			provinceDao.save(province);
			tx.commit();
		}
		catch(Exception ex){
			tx.rollback();
		}
		finally{
			session.close();
		}
	}

	@Override
	public List<Province> getAllProvince() {
		// TODO Auto-generated method stub
		ProvinceDAO provinceDao=new ProvinceDAO();
		return provinceDao.findAll();
	}

	@Override
	public Province getProvinceByName(String pname) {
		// TODO Auto-generated method stub
		ProvinceDAO provinceDao=new ProvinceDAO();
		List<Province> province_list=provinceDao.findByProvinceName(pname);
		if(province_list.isEmpty()){
			return null;
		}
		return province_list.get(0);
	}
}
