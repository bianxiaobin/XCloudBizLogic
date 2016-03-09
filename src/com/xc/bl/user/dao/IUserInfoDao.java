package com.xc.bl.user.dao;

public interface IUserInfoDao {
	/**
	 * 更新用户最后登录时间
	 * 
	 * @param uid
	 *            用户ID
	 * @return
	 */
	public int updLastLoginTime(long uid);
}
