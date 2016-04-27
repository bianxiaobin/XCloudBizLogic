package com.xc.bl.app;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xc.bl.app.service.IAppInfoService;
import com.xc.bl.entities.App;
import com.xc.bl.utils.CommonDefine.AppPushType;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext*.xml"})  
public class IAppInfoTest {

	@Autowired
	IAppInfoService iAppInfo;
	
	@Test
	public void testGetAppListByIspush() {
		List<App> app_list=iAppInfo.getAppListByIspush(AppPushType.PUSH);
		for(App app : app_list){
			System.out.println(app.toString());
		}
		assertTrue(true);
	}

	//@Test
	public void testGetAppById() {
		fail("Not yet implemented");
	}

	//@Test
	public void testAddApp() {
		fail("Not yet implemented");
	}

}
