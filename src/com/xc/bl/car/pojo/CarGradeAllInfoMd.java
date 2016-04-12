package com.xc.bl.car.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


public class CarGradeAllInfoMd {

	private int cbid;
	private String cbname;
	private short cbishot;
	private char cbletter;
	private String cblogo;
	
	private int cfid;
	private String cfname;
	
	private int cmid;
	private String cmname;
	private String cmsi;
	
	private int cgid;
	private String cgname;
	private int cgy;
	private String cge;
	private String cgsi;
	
	
	public CarGradeAllInfoMd(int cbid, String cbname, short cbishot,
			char cbletter, String cblogo, int cfid, String cfname, int cmid,
			String cmname, String cmsi, int cgid, String cgname, int cgy,
			String cge, String cgsi) {
		super();
		this.cbid = cbid;
		this.cbname = cbname;
		this.cbishot = cbishot;
		this.cbletter = cbletter;
		this.cblogo = cblogo;
		this.cfid = cfid;
		this.cfname = cfname;
		this.cmid = cmid;
		this.cmname = cmname;
		this.cmsi = cmsi;
		this.cgid = cgid;
		this.cgname = cgname;
		this.cgy = cgy;
		this.cge = cge;
		this.cgsi = cgsi;
	}
	public int getCbid() {
		return cbid;
	}
	public void setCbid(int cbid) {
		this.cbid = cbid;
	}
	public String getCbname() {
		return cbname;
	}
	public void setCbname(String cbname) {
		this.cbname = cbname;
	}
	public short getCbishot() {
		return cbishot;
	}
	public void setCbishot(short cbishot) {
		this.cbishot = cbishot;
	}
	public char getCbletter() {
		return cbletter;
	}
	public void setCbletter(char cbletter) {
		this.cbletter = cbletter;
	}
	public String getCblogo() {
		return cblogo;
	}
	public void setCblogo(String cblogo) {
		this.cblogo = cblogo;
	}
	public int getCfid() {
		return cfid;
	}
	public void setCfid(int cfid) {
		this.cfid = cfid;
	}
	public String getCfname() {
		return cfname;
	}
	public void setCfname(String cfname) {
		this.cfname = cfname;
	}
	public int getCmid() {
		return cmid;
	}
	public void setCmid(int cmid) {
		this.cmid = cmid;
	}
	public String getCmname() {
		return cmname;
	}
	public void setCmname(String cmname) {
		this.cmname = cmname;
	}
	public String getCmsi() {
		return cmsi;
	}
	public void setCmsi(String cmsi) {
		this.cmsi = cmsi;
	}
	public int getCgid() {
		return cgid;
	}
	public void setCgid(int cgid) {
		this.cgid = cgid;
	}
	public String getCgname() {
		return cgname;
	}
	public void setCgname(String cgname) {
		this.cgname = cgname;
	}
	public int getCgy() {
		return cgy;
	}
	public void setCgy(int cgy) {
		this.cgy = cgy;
	}
	public String getCge() {
		return cge;
	}
	public void setCge(String cge) {
		this.cge = cge;
	}
	public String getCgsi() {
		return cgsi;
	}
	public void setCgsi(String cgsi) {
		this.cgsi = cgsi;
	}
	
	
	
}
