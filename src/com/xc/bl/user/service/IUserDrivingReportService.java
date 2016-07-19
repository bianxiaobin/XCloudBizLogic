package com.xc.bl.user.service;

import java.util.List;

import com.xc.bl.entities.DrivingReport;

public interface IUserDrivingReportService {
	
	public void addDrivingReport(DrivingReport dr);
	
	public DrivingReport getDRByUserLast(long uid);
	
	public List<DrivingReport> getDRByUser(long uid);
	
	public void updDrivingReport(DrivingReport dr);
}
