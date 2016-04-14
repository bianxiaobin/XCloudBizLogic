package com.xc.bl.music.service;

import java.util.List;

import com.xc.bl.pojo.Music;
import com.xc.bl.pojo.MusicLog;
import com.xc.bl.pojo.Singer;


public interface IMusicInfo {
	
	public Music getMusicById(long id);
	
	public List<Music> getMusicByMusicAlbumId(int id);
	
	public void recordMusicLog(MusicLog ml);
	
	public void addMusic(Music music);
	
	public void addSinger(Singer singer);
	
	public Singer getSingerById(int id);
}
