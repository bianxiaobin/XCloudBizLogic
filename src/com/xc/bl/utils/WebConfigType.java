package com.xc.bl.utils;

public class WebConfigType {
	public static final String DOMAIN_IMG="domain_img";
	public static final String DOMAIN_TAPP="domain_tapp";
	public static final String DOMAIN_APP="domain_app";
	public static final String DOMAIN_MAP="domain_map";
	public static final String DOMAIN_MUSIC="domain_music";
	public static final String MAP_UPD_REFRESH="map_upd_refresh";
	public static final String MAP_URL_SRC_GD="map_url_src_gd";
	public static final String STORE_SHOW_TYPE_IOS="store_show_type_ios";
	public static final String SEND_SMS="send_sms";
	public static final String TEST_USER_PHONE_SCOPE_MIN="test_user_phone_scope_min";
	public static final String TEST_USER_PHONE_SCOPE_MAX="test_user_phone_scope_max";
	public static final String MOST_VERCODE_IOS="most_vercode_ios";
	
	public static class MAP_UPD_REFRESH_VALUE{
		//刷新
		public static final String TRUE="1";
		//不刷新
		public static final String FALSE="0";
	}
	
	public static class MAP_URL_SRC_GD_VALUE{
		//本地
		public static final String LOCAL="0";
		//官方地址
		public static final String ORIGINAL="1";
	}
	
	public static class SEND_SMS_VALUE{
		//不发送
		public static final String NOT_SEND="0";
		//发送
		public static final String SEND="1";
	}
	
	public static class STORE_SHOW_TYPE_IOS_VALUE{
		//不展示
		public static final String NOT_SHOW="0";
		//展示
		public static final String SHOW="1";

	}
}
