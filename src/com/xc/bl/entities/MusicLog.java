package com.xc.bl.entities;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MusicLog entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "music_log", catalog = "xcdb")
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
	@Id
	@GeneratedValue
	@Column(name = "music_log_id", unique = true, nullable = false)
	public Long getMusicLogId() {
		return this.musicLogId;
	}

	public void setMusicLogId(Long musicLogId) {
		this.musicLogId = musicLogId;
	}

	@Column(name = "user_id", nullable = false)
	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Column(name = "music_id", nullable = false)
	public Integer getMusicId() {
		return this.musicId;
	}

	public void setMusicId(Integer musicId) {
		this.musicId = musicId;
	}

	@Column(name = "music_log_opt", nullable = false)
	public Short getMusicLogOpt() {
		return this.musicLogOpt;
	}

	public void setMusicLogOpt(Short musicLogOpt) {
		this.musicLogOpt = musicLogOpt;
	}

	@Column(name = "music_log_opt_datatime", nullable = false, length = 19)
	public Timestamp getMusicLogOptDatatime() {
		return this.musicLogOptDatatime;
	}

	public void setMusicLogOptDatatime(Timestamp musicLogOptDatatime) {
		this.musicLogOptDatatime = musicLogOptDatatime;
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