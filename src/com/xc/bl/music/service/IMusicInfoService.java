package com.xc.bl.music.service;

import java.util.List;

import com.xc.bl.entities.Music;
import com.xc.bl.entities.MusicLog;
import com.xc.bl.entities.Singer;


public interface IMusicInfoService {
	
	public Music getMusicById(long id);
	
	public List<Music> getMusicByMusicAlbumId(int id);
	
	public void addMusicLog(MusicLog ml);
	
	public void addMusic(Music music);
	
	public void addSinger(Singer singer);
	
	public Singer getSingerById(int id);
}
