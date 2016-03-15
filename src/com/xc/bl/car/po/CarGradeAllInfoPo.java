package com.xc.bl.car.po;

import com.xc.bl.pojo.CarBrand;
import com.xc.bl.pojo.CarFactory;
import com.xc.bl.pojo.CarGrade;
import com.xc.bl.pojo.CarModel;

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
	
}
