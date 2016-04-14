package com.xc.bl.musicalbum.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xc.bl.musicalbum.dao.IMusicAlbumDao;
import com.xc.bl.musicalbum.dao.MusicAlbumDaoImpl;
import com.xc.bl.pojo.HibernateSessionFactory;
import com.xc.bl.pojo.MusicAlbum;
import com.xc.bl.pojo.MusicAlbumDAO;



public class  MusicAlbumInfoImpl implements IMusicAlbumInfo{
	private final Logger logger=Logger.getLogger(MusicAlbumInfoImpl.class);

	
	public List<MusicAlbum> getMusicAlbumList(){
		MusicAlbumDAO musicAlbumDao=new MusicAlbumDAO();
		List<MusicAlbum> ma_list=musicAlbumDao.findAll();
		//HibernateSessionFactory.getSessionFactory().evict(MusicAlbum.class);
		return ma_list;
	}
	
	@Override
	public List<MusicAlbum> getMusicAlbumList_desc() {
		// TODO Auto-generated method stub
		IMusicAlbumDao iMusicAlbumDao=new MusicAlbumDaoImpl();
		return iMusicAlbumDao.getMusicAlbumList_desc();
	}

	public MusicAlbum getMusicAlbumById(int id){
		MusicAlbumDAO musicAlbumDao=new MusicAlbumDAO();
		return musicAlbumDao.findById(id);
	}
	
	@Override
	public void addMusicAlbum(MusicAlbum musicAlbum) {
		// TODO Auto-generated method stub
		MusicAlbumDAO musicAlbumDao=new MusicAlbumDAO();
		Session session=HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
		try{
			musicAlbumDao.save(musicAlbum);
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
	public List<MusicAlbum> getMusicAlbumByName(String maname) {
		// TODO Auto-generated method stub
		MusicAlbumDAO musicAlbumDao=new MusicAlbumDAO();
		return musicAlbumDao.findByMusicAlbumName(maname);
	}


}
