package com.xc.bl.musicalbum.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.entities.MusicAlbum;
import com.xc.bl.musicalbum.dao.IMusicAlbumDao;
import com.xc.bl.musicalbum.service.IMusicAlbumInfoService;

@Service("musicAlbumInfoService")
public class MusicAlbumInfoServiceImpl implements IMusicAlbumInfoService {
	private final Logger logger = Logger
			.getLogger(MusicAlbumInfoServiceImpl.class);

	@Autowired
	private IMusicAlbumDao musicAlbumDao;

	public List<MusicAlbum> getMusicAlbumList() {
		return musicAlbumDao.getMusicAlbumList();
	}

	@Override
	public List<MusicAlbum> getMusicAlbumList_desc() {

		return musicAlbumDao.getMusicAlbumList_desc();

	}

	public MusicAlbum getMusicAlbumById(int id) {

		return musicAlbumDao.getMusicAlbumById(id);

	}

	@Override
	public void addMusicAlbum(MusicAlbum musicAlbum) {

		musicAlbumDao.addMusicAlbum(musicAlbum);

	}

	@Override
	public List<MusicAlbum> getMusicAlbumByName(String maname) {

		return musicAlbumDao.getMusicAlbumByName(maname);

	}

}
