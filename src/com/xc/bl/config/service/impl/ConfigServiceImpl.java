package com.xc.bl.config.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xc.bl.config.dao.IConfigDao;
import com.xc.bl.config.service.IConfigService;
import com.xc.bl.entities.Config;

@Service("configService")
public class ConfigServiceImpl implements IConfigService {

	@Autowired
	private IConfigDao configDao;

	@Override
	public Config getCfgByName(String name) {
		return configDao.getCfgByName(name);

	}

	@Override
	public void updCfgByName(Config config) {
		config.setConfigId(getCfgByName(config.getCfgName()).getConfigId());
		configDao.updCfgByName(config);

	}

	@Override
	public List<Config> findConfig() {
		return configDao.findConfig();
	}
}
