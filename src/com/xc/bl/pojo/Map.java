package com.xc.bl.pojo;

import java.sql.Timestamp;

/**
 * Map entity. @author MyEclipse Persistence Tools
 */

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

	public Integer getMapId() {
		return this.mapId;
	}

	public void setMapId(Integer mapId) {
		this.mapId = mapId;
	}

	public String getMapName() {
		return this.mapName;
	}

	public void setMapName(String mapName) {
		this.mapName = mapName;
	}

	public String getMapCity() {
		return this.mapCity;
	}

	public void setMapCity(String mapCity) {
		this.mapCity = mapCity;
	}

	public Integer getProvinceId() {
		return this.provinceId;
	}

	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}

	public String getMapCompany() {
		return this.mapCompany;
	}

	public void setMapCompany(String mapCompany) {
		this.mapCompany = mapCompany;
	}

	public String getMapIntroduce() {
		return this.mapIntroduce;
	}

	public void setMapIntroduce(String mapIntroduce) {
		this.mapIntroduce = mapIntroduce;
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