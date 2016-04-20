package com.xc.bl.car;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xc.bl.car.service.ICarBrandService;
import com.xc.bl.entities.CarBrand;
import com.xc.bl.utils.CommonDefine.BrandType;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext*.xml")
public class ICarBrandTest {
	@Autowired
	private ICarBrandService carBrandService;

	@Test
	public void testGetCarBrandList() {
		List<CarBrand> cb_list = carBrandService.getCarBrandList(BrandType.ALL,
				200);
		if (cb_list != null && cb_list.size() > 0) {
			System.out.println("==热门车列表==");
			for (CarBrand cb : cb_list) {
				System.out.println(cb.toString());
			}
			assertTrue(true);
		} else {
			assertTrue(false);
		}
	}

	// @Test
	public void testAddCarBrand() {
		CarBrand cb = new CarBrand();
		cb.setCarBrandIshot((short) 1);
		cb.setCarBrandName("Z9969");
		cb.setCarBrandLogo("2938753114209528.jpg");
		cb.setCarBrandNameLetter("Z");
		carBrandService.addCarBrand(cb);
		if (cb.getCarBrandId() > 0) {
			System.out.println("添加成功 -> " + cb.toString());
			assertTrue(true);
		} else {
			assertTrue(false);
		}
	}

	@Test
	public void testGetCarBrandById() {
		CarBrand cb = carBrandService.getCarBrandById(1);
		if (cb != null) {
			System.out.println("(ID)厂商 -> " + cb.toString());
			assertTrue(true);
		} else {
			assertTrue(false);
		}
	}

	@Test
	public void testGetCarBrandByName() {
		CarBrand cb = carBrandService.getCarBrandByName("奥迪");
		if (cb != null) {
			System.out.println("(Name)厂商 -> " + cb.toString());
			assertTrue(true);
		} else {
			assertTrue(false);
		}
	}
}
