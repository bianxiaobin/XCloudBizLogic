package com.xc.bl.user.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xc.bl.entities.DrivingReport;
import com.xc.bl.entities.dao.IBaseDAO;
import com.xc.bl.user.dao.IUserDrivingReportDao;

@Repository("userDrivingReportDao")
public class UserDrivingReportDaoImpl implements IUserDrivingReportDao {

	@Autowired
	private IBaseDAO<DrivingReport> baseDAO;
	
	@Override
	public void addDrivingReport(DrivingReport dr) {
		baseDAO.save(dr);
	}

	@Override
	public DrivingReport getDRByUserLast(long uid) {
		return baseDAO.get("from  DrivingReport  where user_id=? order by drDate desc", new Object[]{uid});
	}

}
