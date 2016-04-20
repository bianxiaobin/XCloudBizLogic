package com.xc.bl.app;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xc.bl.app.service.IAppUpdInfoService;
import com.xc.bl.app.service.impl.AppUpdInfoServiceImpl;
import com.xc.bl.entities.App;
import com.xc.bl.entities.AppUpd;
import com.xc.bl.musicalbum.service.IMusicAlbumInfoService;
import com.xc.bl.utils.SpringUtils;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext*.xml")
public class IAppUpdInfoTest {

	
	@Autowired
	IMusicAlbumInfoService musicAlbumInfoService;
	
	@Test
	public void testGetAppUpdLastByAppId() {
		
		System.out.println("ApplicationContext -> "+SpringUtils.getApplicationContext());
		System.out.println(SpringUtils.getApplicationContext().getId());
		System.out.println(""+musicAlbumInfoService);
		
		IAppUpdInfoService iAppUpdInfo=SpringUtils.getBean(IAppUpdInfoService.class);
		AppUpd appUpd=iAppUpdInfo.getAppUpdLastByAppId(1);
		System.out.println(appUpd.toString());
		
		//System.out.println("ctx -> "+SpringUtils.getApplicationContext());
	}

	//@Test
	public void testAddAppUpd() {
		fail("Not yet implemented");
	}

}
