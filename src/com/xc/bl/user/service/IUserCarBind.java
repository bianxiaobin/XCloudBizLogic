package com.xc.bl.user.service;

import java.util.List;

import com.xc.bl.pojo.Car;
import com.xc.bl.pojo.UserCarBind;

public interface IUserCarBind {
	/**
	 * 添加用户和车绑定
	 * 
	 * @param ucb
	 */
	public UserCarBind addUserCarBind(UserCarBind ucb);

	/**
	 * 获得用户绑定的车列表
	 * 
	 * @param uid
	 * @return
	 */
	public List<UserCarBind> getUserCarBindByUid(long uid);
	
	/**
	 * 创建Car并绑定用户
	 * @param uid
	 * @param car
	 * @return
	 */
	public UserCarBind UserNewCarBind(long uid,Car car);
	
	/**
	 * 获得用户和车绑定信息，通过绑定id
	 * @param ubid
	 * @return
	 */
	public UserCarBind getUserCarBindById(long ubid);

}
