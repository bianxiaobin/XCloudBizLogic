package com.xc.bl.pojo;

import java.sql.Timestamp;

/**
 * MusicAlbum entity. @author MyEclipse Persistence Tools
 */

public class MusicAlbum implements java.io.Serializable {

	// Fields

	private Integer musicAlbumId;
	private String musicAlbumName;
	private String musicAlbumLable;
	private String musicAlbumDesc;
	private Timestamp dbCreatetime;
	private Timestamp dbUpdatetime;
	private Boolean dbDelete;

	// Constructors

	/** default constructor */
	public MusicAlbum() {
	}

	/** minimal constructor */
	public MusicAlbum(String musicAlbumName) {
		this.musicAlbumName = musicAlbumName;
	}

	/** full constructor */
	public MusicAlbum(String musicAlbumName, String musicAlbumLable,
			String musicAlbumDesc, Timestamp dbCreatetime,
			Timestamp dbUpdatetime, Boolean dbDelete) {
		this.musicAlbumName = musicAlbumName;
		this.musicAlbumLable = musicAlbumLable;
		this.musicAlbumDesc = musicAlbumDesc;
		this.dbCreatetime = dbCreatetime;
		this.dbUpdatetime = dbUpdatetime;
		this.dbDelete = dbDelete;
	}

	// Property accessors

	public Integer getMusicAlbumId() {
		return this.musicAlbumId;
	}

	public void setMusicAlbumId(Integer musicAlbumId) {
		this.musicAlbumId = musicAlbumId;
	}

	public String getMusicAlbumName() {
		return this.musicAlbumName;
	}

	public void setMusicAlbumName(String musicAlbumName) {
		this.musicAlbumName = musicAlbumName;
	}

	public String getMusicAlbumLable() {
		return this.musicAlbumLable;
	}

	public void setMusicAlbumLable(String musicAlbumLable) {
		this.musicAlbumLable = musicAlbumLable;
	}

	public String getMusicAlbumDesc() {
		return this.musicAlbumDesc;
	}

	public void setMusicAlbumDesc(String musicAlbumDesc) {
		this.musicAlbumDesc = musicAlbumDesc;
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