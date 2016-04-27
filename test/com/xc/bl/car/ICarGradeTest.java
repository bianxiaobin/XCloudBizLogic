package com.xc.bl.car;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xc.bl.car.pojo.CarGradeAllInfoPo;
import com.xc.bl.car.service.ICarGradeService;
import com.xc.bl.entities.CarGrade;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext*.xml")
public class ICarGradeTest {

	@Autowired
	private ICarGradeService carGradeService;

	@Test
	public void testAddCarGrade() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGetCarGradeById() {
		CarGrade cg=carGradeService.getCarGradeById(1);
		if(cg!=null){
			System.out.println("(id)配置等级 -> "+cg.toString());
			assertTrue(true);
		}
		else{
			assertTrue(false);
		}
	}

	@Test
	public void testGetCarGradeByName() {
		CarGrade cg=carGradeService.getCarGradeByName("CT 豪华商务舒适版");
		if(cg!=null){
			System.out.println("(Name)配置等级 -> "+cg.toString());
			assertTrue(true);
		}
		else{
			assertTrue(false);
		}
	}

	@Test
	public void testGetCarGradeByCmid() {
		List<CarGrade> cg_list=carGradeService.getCarGradeByCmid(1);
		if(cg_list!=null){
			for(CarGrade cg : cg_list){
				System.out.println(cg.toString());
				assertTrue(true);
			}
		}
		else{
			assertTrue(false);
		}
	}

	@Test
	public void testGetCarGradeByUnique() {
		CarGrade cg=carGradeService.getCarGradeByUnique("手动 尊享型", 2015, "1.5L", 1);
		if(cg!=null){
			System.out.println(cg.toString());
			assertTrue(true);
		}
		else{
			assertTrue(false);
		}
	}

	@Test
	public void testGetCarGradeAllInfoById() {
		CarGradeAllInfoPo cgai=carGradeService.getCarGradeAllInfoById(1);
		if(cgai!=null){
			System.out.println(" testGetCarGradeAllInfoById -> "+cgai.toString());
			assertTrue(true);
		}
		else{
			assertTrue(false);
		}
	}

}
