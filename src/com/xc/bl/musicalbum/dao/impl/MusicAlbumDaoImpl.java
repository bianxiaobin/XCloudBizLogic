package com.xc.bl.musicalbum.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xc.bl.entities.MusicAlbum;
import com.xc.bl.entities.dao.IBaseDAO;
import com.xc.bl.musicalbum.dao.IMusicAlbumDao;

@Repository("musicAlbumDao")
public class MusicAlbumDaoImpl implements IMusicAlbumDao {

	@Autowired
	private IBaseDAO<MusicAlbum> baseDAO;

	@Override
	public List<MusicAlbum> getMusicAlbumList_desc() {
		return baseDAO.find("from MusicAlbum ORDER BY musicAlbumId DESC");
	}

	public List<MusicAlbum> getMusicAlbumList() {
		return baseDAO.find("from MusicAlbum");
	}

	public MusicAlbum getMusicAlbumById(int id) {

		return baseDAO.get("from MusicAlbum where musicAlbumId=?",
				new Object[] { id });

	}

	@Override
	public void addMusicAlbum(MusicAlbum musicAlbum) {

		baseDAO.save(musicAlbum);
	}

	@Override
	public List<MusicAlbum> getMusicAlbumByName(String maname) {

		return baseDAO.find("from MusicAlbum where musicAlbumName=?",
				new Object[] { maname });

	}
}
