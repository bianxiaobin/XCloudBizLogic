package com.xc.bl.user.dao;

import com.xc.bl.entities.DrivingReport;

public interface IUserDrivingReportDao {
	
	public void addDrivingReport(DrivingReport dr);
	
	public DrivingReport getDRByUserLast(long uid);
	
}
