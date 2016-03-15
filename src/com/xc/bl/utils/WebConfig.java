package com.xc.bl.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xc.bl.pojo.Config;
import com.xc.bl.pojo.ConfigDAO;
import com.xc.bl.pojo.HibernateSessionFactory;

public class WebConfig {
	private static Logger logger=Logger.getLogger(WebConfig.class);
	
	private static Map<String,String> cfg_map=new HashMap<String,String>();
	//刷新时间
	private static long UPD_INTERVAL=120*1000;
	//最后更新时间
	private static long upd_last_time=0L;
	
	public static String getCfgByName(String name){
		long curr_time=System.currentTimeMillis();
		String value=cfg_map.get(name);
		if(value==null || value.isEmpty() || curr_time>upd_last_time+UPD_INTERVAL){
			ConfigDAO cfg_dao=new ConfigDAO();
			List<Config> cfg_list=cfg_dao.findByCfgName(name);
			if(cfg_list!=null && !cfg_list.isEmpty()){
				value=cfg_list.get(0).getCfgValue();
				cfg_map.put(name, value);
				upd_last_time=curr_time;
			}
		}
		return value;
	}
	
	public static int setCfgByName(String name,String value){
		int result=-1;
		String hql="update Config config set config.cfgValue=:cfgValue where config.cfgName=:cfgName";
		Session session=HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
		try{
		Query query=session.createQuery(hql);
		query.setString("cfgName", name);
		query.setString("cfgValue", value);
		result=query.executeUpdate();
		tx.commit();
		}
		catch(Exception e){
			tx.rollback();
		}
		finally{
			session.close();
		}
		return result;
	}
	
	
	public static class Cfg{
		public static String DOMAIN_IMG="domain_img";
	}
	
}
