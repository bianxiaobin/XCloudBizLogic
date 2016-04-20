package com.xc.bl.config.dao;

import com.xc.bl.entities.Config;

public interface IConfigDao {
	
	
	//========================================
	
	
	public Config getCfgByName(String name);
	
	public void updCfgByName(Config config);
	
}
