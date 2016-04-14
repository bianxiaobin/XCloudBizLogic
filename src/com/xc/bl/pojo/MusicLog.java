package com.xc.bl.pojo;

import java.sql.Timestamp;

/**
 * MusicLog entity. @author MyEclipse Persistence Tools
 */

public class MusicLog implements java.io.Serializable {

	// Fields

	private Long musicLogId;
	private Long userId;
	private Integer musicId;
	private Short musicLogOpt;
	private Timestamp musicLogOptDatatime;
	private Timestamp dbCreatetime;
	private Timestamp dbUpdatetime;
	private Boolean dbDelete;

	// Constructors

	/** default constructor */
	public MusicLog() {
	}

	/** minimal constructor */
	public MusicLog(Long userId, Integer musicId, Short musicLogOpt,
			Timestamp musicLogOptDatatime) {
		this.userId = userId;
		this.musicId = musicId;
		this.musicLogOpt = musicLogOpt;
		this.musicLogOptDatatime = musicLogOptDatatime;
	}

	/** full constructor */
	public MusicLog(Long userId, Integer musicId, Short musicLogOpt,
			Timestamp musicLogOptDatatime, Timestamp dbCreatetime,
			Timestamp dbUpdatetime, Boolean dbDelete) {
		this.userId = userId;
		this.musicId = musicId;
		this.musicLogOpt = musicLogOpt;
		this.musicLogOptDatatime = musicLogOptDatatime;
		this.dbCreatetime = dbCreatetime;
		this.dbUpdatetime = dbUpdatetime;
		this.dbDelete = dbDelete;
	}

	// Property accessors

	public Long getMusicLogId() {
		return this.musicLogId;
	}

	public void setMusicLogId(Long musicLogId) {
		this.musicLogId = musicLogId;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Integer getMusicId() {
		return this.musicId;
	}

	public void setMusicId(Integer musicId) {
		this.musicId = musicId;
	}

	public Short getMusicLogOpt() {
		return this.musicLogOpt;
	}

	public void setMusicLogOpt(Short musicLogOpt) {
		this.musicLogOpt = musicLogOpt;
	}

	public Timestamp getMusicLogOptDatatime() {
		return this.musicLogOptDatatime;
	}

	public void setMusicLogOptDatatime(Timestamp musicLogOptDatatime) {
		this.musicLogOptDatatime = musicLogOptDatatime;
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