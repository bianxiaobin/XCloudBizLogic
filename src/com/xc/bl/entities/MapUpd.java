package com.xc.bl.entities;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MapUpd entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "map_upd", catalog = "xcdb")
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
	private String mapUpdPackageNameRoute;
	private int mapUpdSizeRoute;
	private String mapUpdOriginalUrlRoute;

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
	@Id
	@GeneratedValue
	@Column(name = "map_upd_id", unique = true, nullable = false)
	public Long getMapUpdId() {
		return this.mapUpdId;
	}

	public void setMapUpdId(Long mapUpdId) {
		this.mapUpdId = mapUpdId;
	}

	@Column(name = "map_id", nullable = false)
	public Integer getMapId() {
		return this.mapId;
	}

	public void setMapId(Integer mapId) {
		this.mapId = mapId;
	}

	@Column(name = "map_upd_readme", length = 500)
	public String getMapUpdReadme() {
		return this.mapUpdReadme;
	}

	public void setMapUpdReadme(String mapUpdReadme) {
		this.mapUpdReadme = mapUpdReadme;
	}

	@Column(name = "map_upd_vercode", nullable = false)
	public Integer getMapUpdVercode() {
		return this.mapUpdVercode;
	}

	public void setMapUpdVercode(Integer mapUpdVercode) {
		this.mapUpdVercode = mapUpdVercode;
	}

	@Column(name = "map_upd_version", nullable = false, length = 20)
	public String getMapUpdVersion() {
		return this.mapUpdVersion;
	}

	public void setMapUpdVersion(String mapUpdVersion) {
		this.mapUpdVersion = mapUpdVersion;
	}

	@Column(name = "map_upd_datatime", nullable = false, length = 19)
	public Timestamp getMapUpdDatatime() {
		return this.mapUpdDatatime;
	}

	public void setMapUpdDatatime(Timestamp mapUpdDatatime) {
		this.mapUpdDatatime = mapUpdDatatime;
	}

	@Column(name = "map_upd_size", nullable = false)
	public Long getMapUpdSize() {
		return this.mapUpdSize;
	}

	public void setMapUpdSize(Long mapUpdSize) {
		this.mapUpdSize = mapUpdSize;
	}

	@Column(name = "map_upd_package_name", nullable = false, length = 50)
	public String getMapUpdPackageName() {
		return this.mapUpdPackageName;
	}

	public void setMapUpdPackageName(String mapUpdPackageName) {
		this.mapUpdPackageName = mapUpdPackageName;
	}

	@Column(name = "map_upd_original_url", length = 200)
	public String getMapUpdOriginalUrl() {
		return this.mapUpdOriginalUrl;
	}

	public void setMapUpdOriginalUrl(String mapUpdOriginalUrl) {
		this.mapUpdOriginalUrl = mapUpdOriginalUrl;
	}

	@Column(name = "db_createtime", nullable = false, length = 19)
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
	
	@Column(name = "map_upd_package_name_route", length = 50)
	public String getMapUpdPackageNameRoute() {
		return mapUpdPackageNameRoute;
	}

	public void setMapUpdPackageNameRoute(String mapUpdPackageNameRoute) {
		this.mapUpdPackageNameRoute = mapUpdPackageNameRoute;
	}

	@Column(name = "map_upd_size_route", length = 20)
	public int getMapUpdSizeRoute() {
		return mapUpdSizeRoute;
	}

	public void setMapUpdSizeRoute(int mapUpdSizeRoute) {
		this.mapUpdSizeRoute = mapUpdSizeRoute;
	}

	@Column(name = "map_upd_original_url_route", length = 200)
	public String getMapUpdOriginalUrlRoute() {
		return mapUpdOriginalUrlRoute;
	}

	public void setMapUpdOriginalUrlRoute(String mapUpdOriginalUrlRoute) {
		this.mapUpdOriginalUrlRoute = mapUpdOriginalUrlRoute;
	}
	
	
}