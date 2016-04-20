package com.xc.bl.music.dao;

import java.util.List;

import com.xc.bl.entities.Music;
import com.xc.bl.entities.MusicLog;
import com.xc.bl.entities.Singer;


public interface IMusicInfoDao {
	
	
	//==============================================
	
	public Music getMusicById(long id);
	
	public List<Music> getMusicByMusicAlbumId(int id);
	
	public void addMusicLog(MusicLog ml);
	
	public void addMusic(Music music);
	
	public void addSinger(Singer singer);
	
	public Singer getSingerById(int id);
}
