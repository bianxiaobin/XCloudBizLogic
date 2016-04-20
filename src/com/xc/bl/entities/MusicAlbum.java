package com.xc.bl.entities;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MusicAlbum entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "music_album", catalog = "xcdb")
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
	@Id
	@GeneratedValue
	@Column(name = "music_album_id", unique = true, nullable = false)
	public Integer getMusicAlbumId() {
		return this.musicAlbumId;
	}

	public void setMusicAlbumId(Integer musicAlbumId) {
		this.musicAlbumId = musicAlbumId;
	}

	@Column(name = "music_album_name", nullable = false, length = 50)
	public String getMusicAlbumName() {
		return this.musicAlbumName;
	}

	public void setMusicAlbumName(String musicAlbumName) {
		this.musicAlbumName = musicAlbumName;
	}

	@Column(name = "music_album_lable", length = 200)
	public String getMusicAlbumLable() {
		return this.musicAlbumLable;
	}

	public void setMusicAlbumLable(String musicAlbumLable) {
		this.musicAlbumLable = musicAlbumLable;
	}

	@Column(name = "music_album_desc", length = 500)
	public String getMusicAlbumDesc() {
		return this.musicAlbumDesc;
	}

	public void setMusicAlbumDesc(String musicAlbumDesc) {
		this.musicAlbumDesc = musicAlbumDesc;
	}

	@Column(name = "db_createtime", length = 19)
	public Timestamp getDbCreatetime() {
		return this.dbCreatetime;
	}

	public void setDbCreatetime(Timestamp dbCreatetime) {
		this.dbCreatetime = dbCreatetime;
	}

	@Column(name = "db_updatetime", length = 19)
	public Timestamp getDbUpdatetime() {
		return this.dbUpdatetime;
	}

	public void setDbUpdatetime(Timestamp dbUpdatetime) {
		this.dbUpdatetime = dbUpdatetime;
	}

	@Column(name = "db_delete")
	public Boolean getDbDelete() {
		return this.dbDelete;
	}

	public void setDbDelete(Boolean dbDelete) {
		this.dbDelete = dbDelete;
	}

}