package com.xc.bl.user.dao;

import java.util.List;

import com.xc.bl.entities.DrivingReport;

public interface IUserDrivingReportDao {
	
	public void addDrivingReport(DrivingReport dr);
	
	public DrivingReport getDRByUserLast(long uid);
	
	public List<DrivingReport> getDRByUser(long uid);
	
	public void updDrivingReport(DrivingReport dr);
}
