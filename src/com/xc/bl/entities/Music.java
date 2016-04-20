package com.xc.bl.entities;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Music entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "music", catalog = "xcdb")
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
	@Id
	@GeneratedValue
	@Column(name = "music_id", unique = true, nullable = false)
	public Long getMusicId() {
		return this.musicId;
	}

	public void setMusicId(Long musicId) {
		this.musicId = musicId;
	}

	@Column(name = "music_name", nullable = false, length = 100)
	public String getMusicName() {
		return this.musicName;
	}

	public void setMusicName(String musicName) {
		this.musicName = musicName;
	}

	@Column(name = "singer_id", nullable = false)
	public Integer getSingerId() {
		return this.singerId;
	}

	public void setSingerId(Integer singerId) {
		this.singerId = singerId;
	}

	@Column(name = "music_size", nullable = false)
	public Long getMusicSize() {
		return this.musicSize;
	}

	public void setMusicSize(Long musicSize) {
		this.musicSize = musicSize;
	}

	@Column(name = "music_time")
	public Integer getMusicTime() {
		return this.musicTime;
	}

	public void setMusicTime(Integer musicTime) {
		this.musicTime = musicTime;
	}

	@Column(name = "music_album_id", nullable = false)
	public Integer getMusicAlbumId() {
		return this.musicAlbumId;
	}

	public void setMusicAlbumId(Integer musicAlbumId) {
		this.musicAlbumId = musicAlbumId;
	}

	@Column(name = "music_path", nullable = false, length = 100)
	public String getMusicPath() {
		return this.musicPath;
	}

	public void setMusicPath(String musicPath) {
		this.musicPath = musicPath;
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