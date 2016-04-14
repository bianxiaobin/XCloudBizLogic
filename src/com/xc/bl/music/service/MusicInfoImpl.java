package com.xc.bl.music.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xc.bl.pojo.HibernateSessionFactory;
import com.xc.bl.pojo.Music;
import com.xc.bl.pojo.MusicDAO;
import com.xc.bl.pojo.MusicLog;
import com.xc.bl.pojo.MusicLogDAO;
import com.xc.bl.pojo.Singer;
import com.xc.bl.pojo.SingerDAO;


public class MusicInfoImpl implements IMusicInfo{
	private final Logger logger=Logger.getLogger(MusicInfoImpl.class);
	
	@Override
	public Music getMusicById(long id) {
		// TODO Auto-generated method stub
		MusicDAO musicDao=new MusicDAO();
		return musicDao.findById(id);
	}

	@Override
	public List<Music> getMusicByMusicAlbumId(int id) {
		// TODO Auto-generated method stub
		MusicDAO musicDao=new MusicDAO();
		return musicDao.findByMusicAlbumId(id);
	}
	
	@Override
	public void recordMusicLog(MusicLog ml) {
		// TODO Auto-generated method stub
		Session session=HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
		try{
		MusicLogDAO musicLogDao=new MusicLogDAO();
		musicLogDao.save(ml);
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
	public Singer getSingerById(int id) {
		// TODO Auto-generated method stub
		SingerDAO singerDao=new SingerDAO();
		return singerDao.findById(id);
	}
	
	@Override
	public void addMusic(Music music) {
		// TODO Auto-generated method stub
		
		Session session=HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
		try{
			MusicDAO musicDao=new MusicDAO();
			musicDao.save(music);
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
	public void addSinger(Singer singer) {
		// TODO Auto-generated method stub
		Session session=HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
		try{
			SingerDAO singerDao=new SingerDAO();
			singerDao.save(singer);
			tx.commit();
		}
		catch(Exception ex){
			tx.rollback();
		}
		finally{
			session.close();
		}
	}
}
