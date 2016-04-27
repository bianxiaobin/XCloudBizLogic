package com.xc.bl.music.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xc.bl.entities.Music;
import com.xc.bl.entities.MusicLog;
import com.xc.bl.entities.Singer;
import com.xc.bl.entities.dao.IBaseDAO;
import com.xc.bl.music.dao.IMusicInfoDao;

@Repository("musicInfoDao")
public class MusicInfoDaoImpl implements IMusicInfoDao {
	private final Logger logger = Logger.getLogger(MusicInfoDaoImpl.class);

	@Autowired
	private IBaseDAO<Music> baseDAO;

	@Autowired
	private IBaseDAO<MusicLog> baseDAO_musicLog;

	@Autowired
	private IBaseDAO<Singer> baseDAO_singer;

	@Override
	public Music getMusicById(long id) {

		return baseDAO.get("from Music where musicId=?", new Object[] { id });

	}

	@Override
	public List<Music> getMusicByMusicAlbumId(int id) {

		return baseDAO.find("from Music where musicAlbumId=?",
				new Object[] { id });

	}

	@Override
	public void addMusicLog(MusicLog ml) {

		baseDAO_musicLog.save(ml);

	}

	@Override
	public Singer getSingerById(int id) {

		return baseDAO_singer.get("from Singer where singerId=?",
				new Object[] { id });

	}

	@Override
	public void addMusic(Music music) {

		baseDAO.save(music);

	}

	@Override
	public void addSinger(Singer singer) {

		baseDAO_singer.save(singer);

	}
}
