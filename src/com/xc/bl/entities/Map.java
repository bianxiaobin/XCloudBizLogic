package com.xc.bl.entities;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Map entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "map", catalog = "xcdb")
public class Map implements java.io.Serializable {

	// Fields

	private Integer mapId;
	private String mapName;
	private String mapCity;
	private Integer provinceId;
	private String mapCompany;
	private String mapIntroduce;
	private Timestamp dbCreatetime;
	private Timestamp dbUpdatetime;
	private Boolean dbDelete;
	private String mapPinyin;

	// Constructors

	/** default constructor */
	public Map() {
	}

	/** minimal constructor */
	public Map(String mapName, String mapCity, Integer provinceId,
			String mapCompany, Timestamp dbCreatetime) {
		this.mapName = mapName;
		this.mapCity = mapCity;
		this.provinceId = provinceId;
		this.mapCompany = mapCompany;
		this.dbCreatetime = dbCreatetime;
	}

	/** full constructor */
	public Map(String mapName, String mapCity, Integer provinceId,
			String mapCompany, String mapIntroduce, Timestamp dbCreatetime,
			Timestamp dbUpdatetime, Boolean dbDelete) {
		this.mapName = mapName;
		this.mapCity = mapCity;
		this.provinceId = provinceId;
		this.mapCompany = mapCompany;
		this.mapIntroduce = mapIntroduce;
		this.dbCreatetime = dbCreatetime;
		this.dbUpdatetime = dbUpdatetime;
		this.dbDelete = dbDelete;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "map_id", unique = true, nullable = false)
	public Integer getMapId() {
		return this.mapId;
	}

	public void setMapId(Integer mapId) {
		this.mapId = mapId;
	}

	@Column(name = "map_name", nullable = false, length = 50)
	public String getMapName() {
		return this.mapName;
	}

	public void setMapName(String mapName) {
		this.mapName = mapName;
	}

	@Column(name = "map_city", nullable = false, length = 50)
	public String getMapCity() {
		return this.mapCity;
	}

	public void setMapCity(String mapCity) {
		this.mapCity = mapCity;
	}

	@Column(name = "province_id", nullable = false)
	public Integer getProvinceId() {
		return this.provinceId;
	}

	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}

	@Column(name = "map_company", nullable = false, length = 50)
	public String getMapCompany() {
		return this.mapCompany;
	}

	public void setMapCompany(String mapCompany) {
		this.mapCompany = mapCompany;
	}

	@Column(name = "map_introduce", length = 500)
	public String getMapIntroduce() {
		return this.mapIntroduce;
	}

	public void setMapIntroduce(String mapIntroduce) {
		this.mapIntroduce = mapIntroduce;
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
	@Column(name = "map_pinyin")
	public String getMapPinyin() {
		return mapPinyin;
	}

	public void setMapPinyin(String mapPinyin) {
		this.mapPinyin = mapPinyin;
	}
	
}