package com.xc.bl.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.entities.DrivingReport;
import com.xc.bl.user.dao.IUserDrivingReportDao;
import com.xc.bl.user.service.IUserDrivingReportService;

@Service("userDrivingReportService")
public class UserDrivingReportServiceImpl implements IUserDrivingReportService {

	@Autowired
	IUserDrivingReportDao iUserDrivingReportDao;
	
	@Override
	public void addDrivingReport(DrivingReport dr) {
		iUserDrivingReportDao.addDrivingReport(dr);
	}

	@Override
	public DrivingReport getDRByUserLast(long uid) {
		return iUserDrivingReportDao.getDRByUserLast(uid);
	}

	@Override
	public List<DrivingReport> getDRByUser(long uid) {
		return iUserDrivingReportDao.getDRByUser(uid);
	}

	@Override
	public void updDrivingReport(DrivingReport dr) {
		iUserDrivingReportDao.updDrivingReport(dr);
	}

}
