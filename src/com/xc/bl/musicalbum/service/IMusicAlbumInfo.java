package com.xc.bl.musicalbum.service;

import java.util.List;

import com.xc.bl.pojo.MusicAlbum;



public interface IMusicAlbumInfo {
	public List<MusicAlbum> getMusicAlbumList();
	public List<MusicAlbum> getMusicAlbumList_desc();
	public MusicAlbum getMusicAlbumById(int id);
	public List<MusicAlbum> getMusicAlbumByName(String maname);
	public void addMusicAlbum(MusicAlbum musicAlbum);
}
