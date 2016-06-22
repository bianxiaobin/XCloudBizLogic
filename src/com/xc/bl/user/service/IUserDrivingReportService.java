package com.xc.bl.user.service;

import com.xc.bl.entities.DrivingReport;

public interface IUserDrivingReportService {
	
	public void addDrivingReport(DrivingReport dr);
	
	public DrivingReport getDRByUserLast(long uid);
}
