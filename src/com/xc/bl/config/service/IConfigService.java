package com.xc.bl.config.service;

import com.xc.bl.entities.Config;

public interface IConfigService {
	
	public Config getCfgByName(String name);
	
	public void updCfgByName(Config config);
}
