package com.xc.bl.musicalbum.dao;

import java.util.List;

import com.xc.bl.pojo.MusicAlbum;



public interface IMusicAlbumDao {
	public List<MusicAlbum> getMusicAlbumList_desc();
}
