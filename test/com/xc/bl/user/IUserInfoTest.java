package com.xc.bl.user;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.hibernate.type.TrueFalseType;
import org.junit.Test;

import com.xc.bl.pojo.User;
import com.xc.bl.user.service.IUserInfo;
import com.xc.bl.user.service.UserInfoImpl;
import com.xc.bl.utils.CommonUtils;

public class IUserInfoTest {
	private final Logger logger=Logger.getLogger(IUserInfoTest.class);
	@Test
	public void testAddUser() {
		IUserInfo iUserInfo=new UserInfoImpl();
		User user=new User();
		user.setUserPhone(13100000000L);
		user.setUserSid("123123");
		user.setUserDatetimeAccessLast(CommonUtils.getTimestampNow());
		iUserInfo.addUser(user);
		if(user.getUserId()!=null && user.getUserId()>0){
			logger.debug("添加用户id -> "+user.getUserId());
			assertTrue(true);
		}
		else{
			logger.debug("添加用户失败");
			assertTrue(false);
		}
	}

	@Test
	public void testGetUserById() {
		IUserInfo iUserInfo=new UserInfoImpl();
		User user=iUserInfo.getUserById(1);
		if(user!=null){
			logger.debug("获得 User 信息（ByID） -> "+user.getUserId()+" "+user.getUserPhone());
			assertTrue(true);
		}
		else{
			assertTrue(false);
		}
	}

	@Test
	public void testGetUserByPhone() {
		IUserInfo iUserInfo=new UserInfoImpl();
		User user=iUserInfo.getUserByPhone(13100000000L);
		if(user!=null){
			logger.debug("获得 User 信息（ByPhone） -> "+user.getUserId()+" "+user.getUserPhone());
			assertTrue(true);
		}
		else{
			assertTrue(false);
		}
	}

	@Test
	public void testUpdLastLoginTime() {
		//fail("Not yet implemented");
		IUserInfo iUserInfo=new UserInfoImpl();
		int updCount=iUserInfo.UpdLastLoginTime(1L);
		if(updCount>0){
			logger.debug("更新用户最新登录时间 ->  成功 ");
			assertTrue(true);
		}
		else{
			logger.debug("更新用户最新登录时间 ->  失败 ");
			assertTrue(false);
		}
	}

}
