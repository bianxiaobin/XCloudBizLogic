package com.xc.bl.user;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.xc.bl.pojo.Car;
import com.xc.bl.pojo.UserCarBind;
import com.xc.bl.user.service.IUserCarBind;
import com.xc.bl.user.service.UserCarBindImpl;

public class IUserCarBindTest {
	private static Logger logger=Logger.getLogger(IUserCarBindTest.class);
	@Test
	public void testAddUserCarBind() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGetUserCarBindByUid() {
		//fail("Not yet implemented");
	}
	
	@Test
	public void testUserNewCarBind() {
		try{
		IUserCarBind iUserCarBind=new UserCarBindImpl();
		Car car=new Car();
		car.setCarUuid("ABC-ABC-ABC-ABC-ACB");
		car.setCarApName("APAPAP");
		car.setCarApPwd("123456789");
		car.setCarBindState((short)2);
		car.setCarGradeId(1);
		UserCarBind userCarBind=iUserCarBind.UserNewCarBind(1, car);
		logger.debug("用户绑定结果  ->"+userCarBind.getUcbId() +"   "+userCarBind.getUserId()+"   "+userCarBind.getCarId());
		assertTrue(true);
		}
		catch(Exception e){
			assertTrue(false);
		}
	}

}
