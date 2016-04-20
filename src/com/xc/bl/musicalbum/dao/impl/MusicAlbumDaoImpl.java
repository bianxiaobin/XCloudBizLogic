package com.xc.bl.musicalbum.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xc.bl.entities.MusicAlbum;
import com.xc.bl.entities.dao.IBaseDAO;
import com.xc.bl.musicalbum.dao.IMusicAlbumDao;


@Repository("musicAlbumDao")
public class MusicAlbumDaoImpl implements IMusicAlbumDao{

	@Autowired
	private IBaseDAO<MusicAlbum> baseDAO;
	
	@Override
	public List<MusicAlbum> getMusicAlbumList_desc() {
		
		String hql="from MusicAlbum WHERE dbDelete=:dbDelete ORDER BY musicAlbumId DESC";
		Map<String,Object> param=new HashMap<String,Object>();
		param.put("dbDelete", false);
		return baseDAO.find(hql,param);
		
		
//		String hql="from MusicAlbum WHERE dbDelete=:dbDelete  ORDER BY musicAlbumId DESC";
//		Session session=HibernateSessionFactory.getSession();
//		Query query=session.createQuery(hql);
//		query.setBoolean("dbDelete", false);
//		return query.list();
	}

	public List<MusicAlbum> getMusicAlbumList(){
		
		return baseDAO.find("from MusicAlbum");
		
//		MusicAlbumDAO musicAlbumDao=new MusicAlbumDAO();
//		List<MusicAlbum> ma_list=musicAlbumDao.findAll();
//		//HibernateSessionFactory.getSessionFactory().evict(MusicAlbum.class);
//		return ma_list;
	}
	
	public MusicAlbum getMusicAlbumById(int id){
		
		return baseDAO.get("from MusicAlbum where musicAlbumId=?", new Object[]{id});
		
//		MusicAlbumDAO musicAlbumDao=new MusicAlbumDAO();
//		return musicAlbumDao.findById(id);
	}
	
	@Override
	public void addMusicAlbum(MusicAlbum musicAlbum) {
		
		baseDAO.save(musicAlbum);
		
//		MusicAlbumDAO musicAlbumDao=new MusicAlbumDAO();
//		Session session=HibernateSessionFactory.getSession();
//		Transaction tx=session.beginTransaction();
//		try{
//			musicAlbumDao.save(musicAlbum);
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
	public List<MusicAlbum> getMusicAlbumByName(String maname) {

		return baseDAO.find("from MusicAlbum where musicAlbumName=?",new Object[]{maname});
		
//		MusicAlbumDAO musicAlbumDao=new MusicAlbumDAO();
//		return musicAlbumDao.findByMusicAlbumName(maname);
	}
}
