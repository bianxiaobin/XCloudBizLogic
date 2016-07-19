package com.xc.bl.user.dao.impl;

import java.util.List;

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

	@Override
	public List<DrivingReport> getDRByUser(long uid) {
		return baseDAO.find("from DrivingReport where user_id=?",new Object[]{uid});
	}

	@Override
	public void updDrivingReport(DrivingReport dr) {
		 baseDAO.update(dr);
	}

}
