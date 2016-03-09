package com.xc.bl.vc;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import com.xc.bl.pojo.VerificationCode;
import com.xc.bl.utils.CommonUtils;
import com.xc.bl.vc.service.IVerifyCode;
import com.xc.bl.vc.service.VerifyCodeImpl;

public class IVerifyCodeTest {
	
	public static Logger logger=Logger.getLogger(IVerifyCodeTest.class);
	
	public void testAddVc() {
		VerificationCode vc=new VerificationCode();
		vc.setVcPhone(13100000005L);
		vc.setVcSendDatetime(CommonUtils.getTimestampNow());
		vc.setVcValue("123123");
		
		IVerifyCode iVerifyCode=new VerifyCodeImpl();
		iVerifyCode.addVc(vc);
	}

	public void testGetVcLastByPhone() {
		IVerifyCode iVerifyCode = new VerifyCodeImpl();
		try {
			VerificationCode vc=iVerifyCode.getVcLastByPhone(13100000000L);
			assertTrue(true);
		} catch (Exception ex) {
			logger.debug("验证码查询错误 -> "+ex.getMessage());
			assertTrue(false);
		}
	}
	
	public void testGetVcFirstByPhoneVc(){
		IVerifyCode iVerifyCode = new VerifyCodeImpl();
		try {
			VerificationCode vc=iVerifyCode.getVcFirstByPhoneVc(13100000001L, "314598");
			logger.debug("验证码 ->"+vc.getVcId()+"  "+vc.getVcPhone() + "   "+vc.getVcValue());
			assertTrue(true);
		} catch (Exception ex) {
			logger.debug("验证码查询错误 -> "+ex.getMessage());
			assertTrue(false);
		}
	}
	
	@Test
	public void test_main(){
		//testAddVc();
		testGetVcFirstByPhoneVc();
	}

}
