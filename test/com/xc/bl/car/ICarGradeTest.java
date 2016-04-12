package com.xc.bl.car;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.xc.bl.car.dao.CarGradeDaoImpl;
import com.xc.bl.car.dao.ICarGradeDao;
import com.xc.bl.car.pojo.CarGradeAllInfoPo;
import com.xc.bl.car.service.CarGradeImpl;
import com.xc.bl.car.service.ICarGrade;

public class ICarGradeTest {
	private static Logger logger=Logger.getLogger(ICarGradeTest.class);
	
	@Test
	public void testGetCarGradeAllInfoById(){
		ICarGrade iCarGrade=new  CarGradeImpl();
		CarGradeAllInfoPo cgaiPo=iCarGrade.getCarGradeAllInfoById(1);
		logger.debug("品牌->" +cgaiPo.getCb().getCarBrandName()+" 生产商-> "+cgaiPo.getCf().getCarFactoryName()+
				" 车型 -> "+cgaiPo.getCm().getCarModelName()+"  车配置-> "+cgaiPo.getCg().getCarGradeName());
		
	}
	@Test
	public void test() {
	}
	


}
