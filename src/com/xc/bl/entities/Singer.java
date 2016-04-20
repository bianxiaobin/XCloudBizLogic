package com.xc.bl.entities;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Singer entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "singer", catalog = "xcdb")
public class Singer implements java.io.Serializable {

	// Fields

	private Integer singerId;
	private String singerName;
	private Long singerFilesize;
	private Timestamp dbCreatetime;
	private Timestamp dbUpdatetime;
	private Boolean dbDelete;

	// Constructors

	/** default constructor */
	public Singer() {
	}

	/** minimal constructor */
	public Singer(String singerName, Long singerFilesize) {
		this.singerName = singerName;
		this.singerFilesize = singerFilesize;
	}

	/** full constructor */
	public Singer(String singerName, Long singerFilesize,
			Timestamp dbCreatetime, Timestamp dbUpdatetime, Boolean dbDelete) {
		this.singerName = singerName;
		this.singerFilesize = singerFilesize;
		this.dbCreatetime = dbCreatetime;
		this.dbUpdatetime = dbUpdatetime;
		this.dbDelete = dbDelete;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "singer_id", unique = true, nullable = false)
	public Integer getSingerId() {
		return this.singerId;
	}

	public void setSingerId(Integer singerId) {
		this.singerId = singerId;
	}

	@Column(name = "singer_name", nullable = false, length = 50)
	public String getSingerName() {
		return this.singerName;
	}

	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}

	@Column(name = "singer_filesize", nullable = false)
	public Long getSingerFilesize() {
		return this.singerFilesize;
	}

	public void setSingerFilesize(Long singerFilesize) {
		this.singerFilesize = singerFilesize;
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