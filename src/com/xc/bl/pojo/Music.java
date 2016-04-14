package com.xc.bl.pojo;

import java.sql.Timestamp;

/**
 * Music entity. @author MyEclipse Persistence Tools
 */

public class Music implements java.io.Serializable {

	// Fields

	private Long musicId;
	private String musicName;
	private Integer singerId;
	private Long musicSize;
	private Integer musicTime;
	private Integer musicAlbumId;
	private String musicPath;
	private Timestamp dbCreatetime;
	private Timestamp dbUpdatetime;
	private Boolean dbDelete;

	// Constructors

	/** default constructor */
	public Music() {
	}

	/** minimal constructor */
	public Music(String musicName, Integer singerId, Long musicSize,
			Integer musicAlbumId, String musicPath) {
		this.musicName = musicName;
		this.singerId = singerId;
		this.musicSize = musicSize;
		this.musicAlbumId = musicAlbumId;
		this.musicPath = musicPath;
	}

	/** full constructor */
	public Music(String musicName, Integer singerId, Long musicSize,
			Integer musicTime, Integer musicAlbumId, String musicPath,
			Timestamp dbCreatetime, Timestamp dbUpdatetime, Boolean dbDelete) {
		this.musicName = musicName;
		this.singerId = singerId;
		this.musicSize = musicSize;
		this.musicTime = musicTime;
		this.musicAlbumId = musicAlbumId;
		this.musicPath = musicPath;
		this.dbCreatetime = dbCreatetime;
		this.dbUpdatetime = dbUpdatetime;
		this.dbDelete = dbDelete;
	}

	// Property accessors

	public Long getMusicId() {
		return this.musicId;
	}

	public void setMusicId(Long musicId) {
		this.musicId = musicId;
	}

	public String getMusicName() {
		return this.musicName;
	}

	public void setMusicName(String musicName) {
		this.musicName = musicName;
	}

	public Integer getSingerId() {
		return this.singerId;
	}

	public void setSingerId(Integer singerId) {
		this.singerId = singerId;
	}

	public Long getMusicSize() {
		return this.musicSize;
	}

	public void setMusicSize(Long musicSize) {
		this.musicSize = musicSize;
	}

	public Integer getMusicTime() {
		return this.musicTime;
	}

	public void setMusicTime(Integer musicTime) {
		this.musicTime = musicTime;
	}

	public Integer getMusicAlbumId() {
		return this.musicAlbumId;
	}

	public void setMusicAlbumId(Integer musicAlbumId) {
		this.musicAlbumId = musicAlbumId;
	}

	public String getMusicPath() {
		return this.musicPath;
	}

	public void setMusicPath(String musicPath) {
		this.musicPath = musicPath;
	}

	public Timestamp getDbCreatetime() {
		return this.dbCreatetime;
	}

	public void setDbCreatetime(Timestamp dbCreatetime) {
		this.dbCreatetime = dbCreatetime;
	}

	public Timestamp getDbUpdatetime() {
		return this.dbUpdatetime;
	}

	public void setDbUpdatetime(Timestamp dbUpdatetime) {
		this.dbUpdatetime = dbUpdatetime;
	}

	public Boolean getDbDelete() {
		return this.dbDelete;
	}

	public void setDbDelete(Boolean dbDelete) {
		this.dbDelete = dbDelete;
	}

}