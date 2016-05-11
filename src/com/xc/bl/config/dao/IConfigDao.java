package com.xc.bl.config.dao;

import java.util.List;

import com.xc.bl.entities.Config;

public interface IConfigDao {
	
	
	//========================================
	
	
	public Config getCfgByName(String name);
	
	public void updCfgByName(Config config);
	
	public List<Config> findConfig();
}
