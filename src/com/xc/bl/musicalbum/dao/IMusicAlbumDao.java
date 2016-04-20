package com.xc.bl.musicalbum.dao;

import java.util.List;

import com.xc.bl.entities.MusicAlbum;

public interface IMusicAlbumDao {
	
	public List<MusicAlbum> getMusicAlbumList_desc();
	
	//===============================================
	
	public List<MusicAlbum> getMusicAlbumList();
	
	public MusicAlbum getMusicAlbumById(int id);
	
	public List<MusicAlbum> getMusicAlbumByName(String maname);
	
	public void addMusicAlbum(MusicAlbum musicAlbum);
	
}
