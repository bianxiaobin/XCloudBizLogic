package com.xc.bl.car.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CarGradeAllInfoPo_tmp {
	@Id
	@GeneratedValue
	private int car_grade_id;
	private String car_grade_name;
	protected CarGradeAllInfoPo_tmp() {
	}
	public int getCar_grade_id() {
		return car_grade_id;
	}
	public void setCar_grade_id(int car_grade_id) {
		this.car_grade_id = car_grade_id;
	}
	public String getCar_grade_name() {
		return car_grade_name;
	}
	public void setCar_grade_name(String car_grade_name) {
		this.car_grade_name = car_grade_name;
	}
	public CarGradeAllInfoPo_tmp(int car_grade_id, String car_grade_name) {
		super();
		this.car_grade_id = car_grade_id;
		this.car_grade_name = car_grade_name;
	}
	
	
	
}
