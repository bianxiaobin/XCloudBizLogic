package com.xc.bl.vc.service.impl;

import java.io.IOException;

import org.apache.commons.httpclient.HttpException;
import org.apache.log4j.Logger;
import org.dom4j.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.entities.VerificationCode;
import com.xc.bl.utils.CommonDefine.SmsSubmitResult;
import com.xc.bl.utils.CommonUtils;
import com.xc.bl.utils.SendSms;
import com.xc.bl.utils.WebConfig;
import com.xc.bl.utils.WebConfigType;
import com.xc.bl.vc.service.ISendVc;
import com.xc.bl.vc.service.IVerifyCodeService;

@Service("sendVc")
public class SendVcImpl implements ISendVc {

	private Logger logger = Logger.getLogger(SendVcImpl.class);

	@Autowired
	private IVerifyCodeService verifyCodeService;

	@Override
	public boolean sendLoginVc(long phone, String vc) {
		boolean sendResult = false;
		try {
			String content = WebConfig.getCfgByName("verify_sms_content")
					.replaceFirst("【变量】", String.valueOf(vc));
			if (content != null && !content.isEmpty()) {
				
				//添加发送短信
				VerificationCode verificationCode = new VerificationCode();
				verificationCode.setVcPhone(phone);
				verificationCode.setVcValue(vc);
				verificationCode.setVcSendDatetime(CommonUtils
						.getTimestampNow());
				verifyCodeService.addVc(verificationCode);
				if(WebConfigType.SEND_SMS_VALUE.SEND.equals(WebConfig.getCfgByName(WebConfigType.SEND_SMS))){
					//发送短信
					String submitResult = SendSms.SendSmsContent(phone, content);
					logger.debug("发送Sms结果 -> " + submitResult);
					
					//更新短信发送结果
					SendSms.SendSmsResult sendSmsResult=SendSms.convertResult(submitResult);
					logger.debug("转换后结果 -> "+sendSmsResult.toString());
					verificationCode.setVcSendResult(sendSmsResult.toString());
					verifyCodeService.updVc(verificationCode);
					
					//提交返回结果成功
					if(Integer.valueOf(sendSmsResult.getCode())==SmsSubmitResult.SUCCESS.getValue()){
						sendResult = true;
					}
				}
				else{
					sendResult=true;
				}
			}
		} catch (HttpException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return sendResult;
	}
}
