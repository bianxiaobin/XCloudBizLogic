package com.xc.bl.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "map_voice", catalog = "xcdb")
public class MapVoice implements Serializable{
	private int mvId;
	private String mvName;
	private String mvOriginalVoiceUrl;
	private int mvVercode;
	private String mvVersion;
	private String mvVoiceFile;
	private int mvVoiceSize;
	private String mvImageFile;
	private String mvTryFile;
	private Short mvIspush;
	private Timestamp dbCreatetime;
	private Timestamp dbUpdatetime;
	private Boolean dbDelete;
	
	@Id
	@GeneratedValue
	@Column(name = "mv_id", unique = true, nullable = false)
	public int getMvId() {
		return mvId;
	}
	@Column(name="mv_name" , nullable = false)
	public String getMvName() {
		return mvName;
	}
	@Column(name="mv_original_voice_url" , nullable=false)
	public String getMvOriginalVoiceUrl() {
		return mvOriginalVoiceUrl;
	}
	@Column(name = "mv_vercode" , nullable = false)
	public int getMvVercode() {
		return mvVercode;
	}
	@Column(name = "mv_version" , nullable = false)
	public String getMvVersion() {
		return mvVersion;
	}
	@Column(name = "mv_voice_file" , nullable = false)
	public String getMvVoiceFile() {
		return mvVoiceFile;
	}
	@Column(name = "mv_voice_size" , nullable = false)
	public int getMvVoiceSize() {
		return mvVoiceSize;
	}
	@Column(name = "mv_image_file" , nullable = false)
	public String getMvImageFile() {
		return mvImageFile;
	}
	@Column(name = "mv_try_file" , nullable = false)
	public String getMvTryFile() {
		return mvTryFile;
	}
	
	@Column(name = "db_createtime" , nullable = false)
	public Timestamp getDbCreatetime() {
		return dbCreatetime;
	}
	@Column(name = "db_updatetime")
	public Timestamp getDbUpdatetime() {
		return dbUpdatetime;
	}
	@Column(name = "db_delete" , nullable = false)
	public Boolean getDbDelete() {
		return dbDelete;
	}
	@Column(name = "mv_ispush" , nullable = false)
	public Short getMvIspush() {
		return mvIspush;
	}
	public void setMvIspush(Short mvIspush) {
		this.mvIspush = mvIspush;
	}
	public void setMvId(int mvId) {
		this.mvId = mvId;
	}
	public void setMvName(String mvName) {
		this.mvName = mvName;
	}
	public void setMvOriginalVoiceUrl(String mvOriginalVoiceUrl) {
		this.mvOriginalVoiceUrl = mvOriginalVoiceUrl;
	}
	public void setMvVercode(int mvVercode) {
		this.mvVercode = mvVercode;
	}
	public void setMvVersion(String mvVersion) {
		this.mvVersion = mvVersion;
	}
	public void setMvVoiceFile(String mvVoiceFile) {
		this.mvVoiceFile = mvVoiceFile;
	}
	public void setMvVoiceSize(int mvVoiceSize) {
		this.mvVoiceSize = mvVoiceSize;
	}
	public void setMvImageFile(String mvImageFile) {
		this.mvImageFile = mvImageFile;
	}
	public void setMvTryFile(String mvTryFile) {
		this.mvTryFile = mvTryFile;
	}
	public void setDbCreatetime(Timestamp dbCreatetime) {
		this.dbCreatetime = dbCreatetime;
	}
	public void setDbUpdatetime(Timestamp dbUpdatetime) {
		this.dbUpdatetime = dbUpdatetime;
	}
	public void setDbDelete(Boolean dbDelete) {
		this.dbDelete = dbDelete;
	}
	
}
