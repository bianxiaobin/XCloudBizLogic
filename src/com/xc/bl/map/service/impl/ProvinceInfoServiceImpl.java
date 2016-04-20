package com.xc.bl.map.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.entities.Province;
import com.xc.bl.map.dao.IProvinceInfoDao;
import com.xc.bl.map.service.IProvinceInfoService;



@Service("provinceInfoService")
public class ProvinceInfoServiceImpl implements IProvinceInfoService {

//	@Autowired
//	private IBaseDAO<Province> baseDAO;
	
	@Autowired
	private IProvinceInfoDao provinceInfoDao;
	
	@Override
	public Province getProvinceById(int pid) {

		return provinceInfoDao.getProvinceById(pid);
//		return baseDAO.get("from Province where provinceId=?", new Object[]{pid});
		
//		ProvinceDAO provinceDao=new ProvinceDAO();
//		return provinceDao.findById(pid);
	}

	@Override
	public void addProvince(Province province) {
		provinceInfoDao.addProvince(province);
//		baseDAO.save(province);
		
//		Session session=HibernateSessionFactory.getSession();
//		Transaction tx=session.beginTransaction();
//		try{
//			ProvinceDAO provinceDao=new ProvinceDAO();
//			provinceDao.save(province);
//			tx.commit();
//		}
//		catch(Exception ex){
//			tx.rollback();
//		}
//		finally{
//			session.close();
//		}
	}

	@Override
	public List<Province> getAllProvince() {
		return provinceInfoDao.getAllProvince();
//		return baseDAO.find("from Province");
		
//		ProvinceDAO provinceDao=new ProvinceDAO();
//		return provinceDao.findAll();
	}

	@Override
	public Province getProvinceByName(String pname) {

		return provinceInfoDao.getProvinceByName(pname);
//		return baseDAO.get("from Province where provinceName", new Object[]{pname});
		
//		ProvinceDAO provinceDao=new ProvinceDAO();
//		List<Province> province_list=provinceDao.findByProvinceName(pname);
//		if(province_list.isEmpty()){
//			return null;
//		}
//		return province_list.get(0);
	}
}
