package com.xc.bl.entities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car_helpdoc", catalog = "xcdb")
public class CarHelpDoc implements java.io.Serializable {
	private int chId;
	private int carGradeId;
	private String chFile;
	private int chSize;
	private Timestamp dbCreatetime;
	private Timestamp dbUpdatetime;
	private Boolean dbDelete;
	
	@Id
	@GeneratedValue
	@Column(name = "ch_id", unique = true, nullable = false)
	public int getChId() {
		return chId;
	}
	public void setChId(int chId) {
		this.chId = chId;
	}
	@Column(name="car_grade_id" , nullable = false)
	public int getCarGradeId() {
		return carGradeId;
	}
	public void setCarGradeId(int carGradeId) {
		this.carGradeId = carGradeId;
	}
	@Column(name = "ch_file" , nullable = false)
	public String getChFile() {
		return chFile;
	}
	public void setChFile(String chFile) {
		this.chFile = chFile;
	}
	@Column(name="ch_size" , nullable=false)
	public int getChSize() {
		return chSize;
	}
	public void setChSize(int chSize) {
		this.chSize = chSize;
	}
	@Column(name = "db_createtime", length = 19)
	public Timestamp getDbCreatetime() {
		return dbCreatetime;
	}
	public void setDbCreatetime(Timestamp dbCreatetime) {
		this.dbCreatetime = dbCreatetime;
	}
	@Column(name = "db_updatetime", length = 19)
	public Timestamp getDbUpdatetime() {
		return dbUpdatetime;
	}
	public void setDbUpdatetime(Timestamp dbUpdatetime) {
		this.dbUpdatetime = dbUpdatetime;
	}
	@Column(name="db_delete")
	public Boolean getDbDelete() {
		return dbDelete;
	}
	public void setDbDelete(Boolean dbDelete) {
		this.dbDelete = dbDelete;
	}
}
