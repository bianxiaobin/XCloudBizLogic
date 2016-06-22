package com.xc.bl.utils;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class SendSms {

	private static String Url = "/webservice/sms.php?method=Submit";
	private static String ACCOUNT = "cf_sainade";
	private static String PWD = "cbsi1234567";

	public static String  SendSmsContent(long phone, String content)
			throws HttpException, IOException {
		HttpClient client = new HttpClient();
		PostMethod method = new PostMethod(WebConfig.getCfgByName(WebConfigType.SMS_SERVER)+Url);
		// client.getParams().setContentCharset("GBK");
		client.getParams().setContentCharset("UTF-8");
		method.setRequestHeader("ContentType",
				"application/x-www-form-urlencoded;charset=UTF-8");

		NameValuePair[] data = {
				new NameValuePair("account", ACCOUNT),
				new NameValuePair("password", MD5Util.encode2hex(PWD)
						.toUpperCase()), // 密码可以使用明文密码或使用32位MD5加密
				new NameValuePair("mobile", String.valueOf(phone)),
				new NameValuePair("content", content), };
		method.setRequestBody(data);

		client.executeMethod(method);

		return method.getResponseBodyAsString();
	}
	
	public static SendSmsResult convertResult(String result_str) throws DocumentException{
		Document doc = DocumentHelper.parseText(result_str);
		Element root = doc.getRootElement();

		SendSmsResult result=new SendSms.SendSmsResult();
		result.setCode(root.elementText("code"));
		result.setMsg(root.elementText("msg"));
		result.setSmsid(root.elementText("smsid"));
		
		return result;
	}
	
	
	 public static class SendSmsResult{
		private String code;
		private String msg;
		private String smsid;
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getMsg() {
			return msg;
		}
		public void setMsg(String msg) {
			this.msg = msg;
		}
		public String getSmsid() {
			return smsid;
		}
		public void setSmsid(String smsid) {
			this.smsid = smsid;
		}
		@Override
		public String toString() {
			return "code=" + code + ", msg=" + msg + ", smsid="
					+ smsid + "";
		}
		
	}
	
}
