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
}
