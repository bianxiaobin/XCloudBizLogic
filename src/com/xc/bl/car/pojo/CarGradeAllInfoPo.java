package com.xc.bl.car.pojo;

import com.xc.bl.entities.CarBrand;
import com.xc.bl.entities.CarFactory;
import com.xc.bl.entities.CarGrade;
import com.xc.bl.entities.CarModel;

public class CarGradeAllInfoPo {
	private CarBrand cb;
	private CarFactory cf;
	private CarModel cm;
	private CarGrade cg;
	public CarBrand getCb() {
		return cb;
	}
	public void setCb(CarBrand cb) {
		this.cb = cb;
	}
	public CarFactory getCf() {
		return cf;
	}
	public void setCf(CarFactory cf) {
		this.cf = cf;
	}
	public CarModel getCm() {
		return cm;
	}
	public void setCm(CarModel cm) {
		this.cm = cm;
	}
	public CarGrade getCg() {
		return cg;
	}
	public void setCg(CarGrade cg) {
		this.cg = cg;
	}
	@Override
	public String toString() {
		return "CarGradeAllInfoPo [cb=" + cb + ", cf=" + cf + ", cm=" + cm
				+ ", cg=" + cg + "]";
	}
	
}
