package com.xc.bl.pojo;

import java.sql.Timestamp;

/**
 * MapUpd entity. @author MyEclipse Persistence Tools
 */

public class MapUpd implements java.io.Serializable {

	// Fields

	private Long mapUpdId;
	private Integer mapId;
	private String mapUpdReadme;
	private Integer mapUpdVercode;
	private String mapUpdVersion;
	private Timestamp mapUpdDatatime;
	private Long mapUpdSize;
	private String mapUpdPackageName;
	private String mapUpdOriginalUrl;
	private Timestamp dbCreatetime;
	private Timestamp dbUpdatetime;
	private Boolean dbDelete;

	// Constructors

	/** default constructor */
	public MapUpd() {
	}

	/** minimal constructor */
	public MapUpd(Integer mapId, Integer mapUpdVercode, String mapUpdVersion,
			Timestamp mapUpdDatatime, Long mapUpdSize,
			String mapUpdPackageName, Timestamp dbCreatetime) {
		this.mapId = mapId;
		this.mapUpdVercode = mapUpdVercode;
		this.mapUpdVersion = mapUpdVersion;
		this.mapUpdDatatime = mapUpdDatatime;
		this.mapUpdSize = mapUpdSize;
		this.mapUpdPackageName = mapUpdPackageName;
		this.dbCreatetime = dbCreatetime;
	}

	/** full constructor */
	public MapUpd(Integer mapId, String mapUpdReadme, Integer mapUpdVercode,
			String mapUpdVersion, Timestamp mapUpdDatatime, Long mapUpdSize,
			String mapUpdPackageName, String mapUpdOriginalUrl,
			Timestamp dbCreatetime, Timestamp dbUpdatetime, Boolean dbDelete) {
		this.mapId = mapId;
		this.mapUpdReadme = mapUpdReadme;
		this.mapUpdVercode = mapUpdVercode;
		this.mapUpdVersion = mapUpdVersion;
		this.mapUpdDatatime = mapUpdDatatime;
		this.mapUpdSize = mapUpdSize;
		this.mapUpdPackageName = mapUpdPackageName;
		this.mapUpdOriginalUrl = mapUpdOriginalUrl;
		this.dbCreatetime = dbCreatetime;
		this.dbUpdatetime = dbUpdatetime;
		this.dbDelete = dbDelete;
	}

	// Property accessors

	public Long getMapUpdId() {
		return this.mapUpdId;
	}

	public void setMapUpdId(Long mapUpdId) {
		this.mapUpdId = mapUpdId;
	}

	public Integer getMapId() {
		return this.mapId;
	}

	public void setMapId(Integer mapId) {
		this.mapId = mapId;
	}

	public String getMapUpdReadme() {
		return this.mapUpdReadme;
	}

	public void setMapUpdReadme(String mapUpdReadme) {
		this.mapUpdReadme = mapUpdReadme;
	}

	public Integer getMapUpdVercode() {
		return this.mapUpdVercode;
	}

	public void setMapUpdVercode(Integer mapUpdVercode) {
		this.mapUpdVercode = mapUpdVercode;
	}

	public String getMapUpdVersion() {
		return this.mapUpdVersion;
	}

	public void setMapUpdVersion(String mapUpdVersion) {
		this.mapUpdVersion = mapUpdVersion;
	}

	public Timestamp getMapUpdDatatime() {
		return this.mapUpdDatatime;
	}

	public void setMapUpdDatatime(Timestamp mapUpdDatatime) {
		this.mapUpdDatatime = mapUpdDatatime;
	}

	public Long getMapUpdSize() {
		return this.mapUpdSize;
	}

	public void setMapUpdSize(Long mapUpdSize) {
		this.mapUpdSize = mapUpdSize;
	}

	public String getMapUpdPackageName() {
		return this.mapUpdPackageName;
	}

	public void setMapUpdPackageName(String mapUpdPackageName) {
		this.mapUpdPackageName = mapUpdPackageName;
	}

	public String getMapUpdOriginalUrl() {
		return this.mapUpdOriginalUrl;
	}

	public void setMapUpdOriginalUrl(String mapUpdOriginalUrl) {
		this.mapUpdOriginalUrl = mapUpdOriginalUrl;
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