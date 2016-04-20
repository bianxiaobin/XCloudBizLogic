package com.xc.bl.config.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.config.dao.IConfigDao;
import com.xc.bl.config.service.IConfigService;
import com.xc.bl.entities.Config;

@Service("configService")
public class ConfigServiceImpl implements IConfigService {

//	@Autowired
//	private IBaseDAO<Config> baseDAO;
	
	@Autowired
	private IConfigDao configDao;
	
	@Override
	public Config getCfgByName(String name) {
		return configDao.getCfgByName(name);
//		return baseDAO.get("from Config where cfgName=?", new Object[]{name});
	}

	@Override
	public void updCfgByName(Config config) {
		config.setConfigId(getCfgByName(config.getCfgName()).getConfigId());
		configDao.updCfgByName(config);
		
//		baseDAO.update(config);
	}
}
