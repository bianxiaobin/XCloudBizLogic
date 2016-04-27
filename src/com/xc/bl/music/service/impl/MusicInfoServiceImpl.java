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
public class MusicInfoServiceImpl implements IMusicInfoService {
	private final Logger logger = Logger.getLogger(MusicInfoServiceImpl.class);

	@Autowired
	private IMusicInfoDao musicInfoDao;

	@Override
	public Music getMusicById(long id) {

		return musicInfoDao.getMusicById(id);

	}

	@Override
	public List<Music> getMusicByMusicAlbumId(int id) {

		return musicInfoDao.getMusicByMusicAlbumId(id);

	}

	@Override
	public void addMusicLog(MusicLog ml) {

		musicInfoDao.addMusicLog(ml);

	}

	@Override
	public Singer getSingerById(int id) {

		return musicInfoDao.getSingerById(id);

	}

	@Override
	public void addMusic(Music music) {

		musicInfoDao.addMusic(music);

	}

	@Override
	public void addSinger(Singer singer) {

		musicInfoDao.addSinger(singer);

	}
}
