package com.xc.bl.car;

import static org.junit.Assert.*;

import org.jboss.logging.Logger;
import org.junit.Test;

import com.xc.bl.car.service.CarInfoImpl;
import com.xc.bl.car.service.ICarInfo;
import com.xc.bl.pojo.Car;

public class ICarInfoTest {

	public static Logger logger=Logger.getLogger(ICarInfoTest.class);
	//@Test
	public void testAddCar() {
		Car car=new Car();
		car.setCarGradeId(1);
		car.setCarApName("ap");
		car.setCarApPwd("123123123");
		car.setCarBindState((short)1);
		car.setCarUuid("aaaaaaaaaaaa-aaaaaaaaa");
		ICarInfo iCarInfo=new CarInfoImpl();
		iCarInfo.addCar(car);
		
	}

	@Test
	public void testUpdCarInfoById() {
		Car car=new Car();
		car.setCarId(5L);
		car.setCarGradeId(1);
		car.setCarApName("ap");
		car.setCarApPwd("123123123");
		car.setCarBindState((short)1);
		car.setCarUuid("abc");
		
		ICarInfo iCarInfo=new CarInfoImpl();
//		Car car_new=iCarInfo.getCarById(1L);
//		logger.debug("Car Info  -> "+car_new.getCarId()+"  "+car_new.getCarUuid());
//		car_new.setCarUuid("abc-abc");
		int updCount=iCarInfo.updCarInfoById(car);
		logger.debug("upd count -> "+updCount);
	}

	@Test
	public void testGetCarById() {
		//fail("Not yet implemented");
	}

}
