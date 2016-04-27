package com.xc.bl.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xc.bl.config.service.IConfigService;
import com.xc.bl.entities.Config;

public class WebConfig {

	private static Logger logger = Logger.getLogger(WebConfig.class);

	private static Map<String, String> cfg_map = new HashMap<String, String>();
	// 刷新时间
	private static long UPD_INTERVAL = 120 * 1000;
	// 最后更新时间
	private static long upd_last_time = 0L;

	public static String getCfgByName(String name) {
		long curr_time = System.currentTimeMillis();
		String value = cfg_map.get(name);
		if (value == null || value.isEmpty()
				|| curr_time > upd_last_time + UPD_INTERVAL) {
			IConfigService iConfigService = SpringUtils
					.getBean("configService");
			Config cfg = iConfigService.getCfgByName(name);
			if (cfg != null) {
				value= cfg.getCfgValue();
				cfg_map.put(name,value);
				upd_last_time = curr_time;
			}
		}
		return value;

	}

	public static int setCfgByName(String name, String value) {
		int result = -1;
		Config cfg = new Config();
		cfg.setCfgName(name);
		cfg.setCfgValue(value);
		try {
			IConfigService iConfigService = SpringUtils
					.getBean("configService");
			iConfigService.updCfgByName(cfg);
			result = 1;
		} catch (Exception ex) {
			result = -1;
		}
		return result;

	}

//	public static class Cfg {
//		public static String DOMAIN_IMG = "domain_img";
//	}
}
