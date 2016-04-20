package com.xc.bl.user.dao;

import com.xc.bl.entities.User;

public interface IUserInfoDao {
	/**
	 * 更新用户最后登录时间
	 * 
	 * @param uid
	 *            用户ID
	 * @return
	 */
	public int updLastLoginTime(long uid);
	
	//============================================
	
	/**
	 * 添加用户
	 * 
	 * @param user
	 */
	public User addUser(User user);

	/**
	 * 根据uid获得用户信息
	 * 
	 * @param uid
	 *            用户ID
	 * @return User
	 */
	public User getUserById(long uid);

	/**
	 * 根据用户手机号获得用户信息
	 * 
	 * @param phoneNum
	 *            用户手机号
	 * @return User
	 */
	public User getUserByPhone(long phoneNum);

}
