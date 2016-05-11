package com.xc.bl.config.service;

import java.util.List;

import com.xc.bl.entities.Config;

public interface IConfigService {
	
	public Config getCfgByName(String name);
	
	public void updCfgByName(Config config);
	
	public List<Config> findConfig();
}
