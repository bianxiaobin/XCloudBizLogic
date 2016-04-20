package com.xc.bl.music.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.entities.Music;
import com.xc.bl.entities.MusicLog;
import com.xc.bl.entities.Singer;
import com.xc.bl.music.dao.IMusicInfoDao;
import com.xc.bl.music.service.IMusicInfoService;

@Service("musicInfoService")
public class MusicInfoServiceImpl implements IMusicInfoService{
	private final Logger logger=Logger.getLogger(MusicInfoServiceImpl.class);
	
//	@Autowired
//	private IBaseDAO<Music> baseDAO;
//	
//	@Autowired
//	private IBaseDAO<MusicLog> baseDAO_musicLog;
//	
//	@Autowired
//	private IBaseDAO<Singer> baseDAO_singer;
	
	@Autowired
	private IMusicInfoDao musicInfoDao;
	
	
	@Override
	public Music getMusicById(long id) {

		return musicInfoDao.getMusicById(id);
//		return baseDAO.get("from Music where musicId=?", new Object[]{id});
		
//		MusicDAO musicDao=new MusicDAO();
//		return musicDao.findById(id);
	}

	@Override
	public List<Music> getMusicByMusicAlbumId(int id) {

		return musicInfoDao.getMusicByMusicAlbumId(id);
//		return baseDAO.find("from Music where musicAlbumId=?",new Object[]{id});
		
//		MusicDAO musicDao=new MusicDAO();
//		return musicDao.findByMusicAlbumId(id);
	}
	
	@Override
	public void addMusicLog(MusicLog ml) {

		musicInfoDao.addMusicLog(ml);
//		baseDAO_musicLog.save(ml);
		
//		Session session=HibernateSessionFactory.getSession();
//		Transaction tx=session.beginTransaction();
//		try{
//		MusicLogDAO musicLogDao=new MusicLogDAO();
//		musicLogDao.save(ml);
//		tx.commit();
//		}
//		catch(Exception ex){
//			tx.rollback();
//		}
//		finally{
//			session.close();
//		}
	}
	
	@Override
	public Singer getSingerById(int id) {

		return musicInfoDao.getSingerById(id);
//		return baseDAO_singer.get("from Singer where singerId=?", new Object[]{id});
		
//		SingerDAO singerDao=new SingerDAO();
//		return singerDao.findById(id);
	}
	
	@Override
	public void addMusic(Music music) {

		musicInfoDao.addMusic(music);
//		baseDAO.save(music);
		
//		Session session=HibernateSessionFactory.getSession();
//		Transaction tx=session.beginTransaction();
//		try{
//			MusicDAO musicDao=new MusicDAO();
//			musicDao.save(music);
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
	public void addSinger(Singer singer) {

		musicInfoDao.addSinger(singer);
//		baseDAO_singer.save(singer);
		
//		Session session=HibernateSessionFactory.getSession();
//		Transaction tx=session.beginTransaction();
//		try{
//			SingerDAO singerDao=new SingerDAO();
//			singerDao.save(singer);
//			tx.commit();
//		}
//		catch(Exception ex){
//			tx.rollback();
//		}
//		finally{
//			session.close();
//		}
	}
}
