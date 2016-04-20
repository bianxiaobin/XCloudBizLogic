package com.xc.bl.musicalbum.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.entities.MusicAlbum;
import com.xc.bl.musicalbum.dao.IMusicAlbumDao;
import com.xc.bl.musicalbum.service.IMusicAlbumInfoService;
import com.xc.bl.utils.SpringUtils;


@Service("musicAlbumInfoService")
public class  MusicAlbumInfoServiceImpl implements IMusicAlbumInfoService{
	private final Logger logger=Logger.getLogger(MusicAlbumInfoServiceImpl.class);

//	@Autowired
//	private IBaseDAO<MusicAlbum> baseDAO;
	
	@Autowired
	private IMusicAlbumDao musicAlbumDao;
	
	public List<MusicAlbum> getMusicAlbumList(){
		return musicAlbumDao.getMusicAlbumList();
//		return baseDAO.find("from MusicAlbum");
		
//		MusicAlbumDAO musicAlbumDao=new MusicAlbumDAO();
//		List<MusicAlbum> ma_list=musicAlbumDao.findAll();
//		//HibernateSessionFactory.getSessionFactory().evict(MusicAlbum.class);
//		return ma_list;
	}
	
	@Override
	public List<MusicAlbum> getMusicAlbumList_desc() {
		
		return musicAlbumDao.getMusicAlbumList_desc();
//		IMusicAlbumDao iMusicAlbumDao=SpringUtils.getBean("musicAlbumDao");
//		return iMusicAlbumDao.getMusicAlbumList_desc();
		
//		IMusicAlbumDao iMusicAlbumDao=new MusicAlbumDaoImpl();
//		return iMusicAlbumDao.getMusicAlbumList_desc();
	}

	public MusicAlbum getMusicAlbumById(int id){
		
		return musicAlbumDao.getMusicAlbumById(id);
		
//		return baseDAO.get("from MusicAlbum where musicAlbumId=?", new Object[]{id});
		
//		MusicAlbumDAO musicAlbumDao=new MusicAlbumDAO();
//		return musicAlbumDao.findById(id);
	}
	
	@Override
	public void addMusicAlbum(MusicAlbum musicAlbum) {
		
		musicAlbumDao.addMusicAlbum(musicAlbum);
		
//		baseDAO.save(musicAlbum);
		
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

		return musicAlbumDao.getMusicAlbumByName(maname);
		
//		return baseDAO.find("from MusicAlbum where musicAlbumName=?",new Object[]{maname});
		
//		MusicAlbumDAO musicAlbumDao=new MusicAlbumDAO();
//		return musicAlbumDao.findByMusicAlbumName(maname);
	}


}
