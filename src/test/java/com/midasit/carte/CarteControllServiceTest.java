package com.midasit.carte;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Calendar;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.midasit.carte.admin.service.CarteControllService;
import com.midasit.carte.common.mapper.CarteMapper;
import com.midasit.carte.common.model.CarteDetailInfo;

@RunWith(MockitoJUnitRunner.class)
public class CarteControllServiceTest {
	@InjectMocks
	private CarteControllService service;
	@Mock
	private CarteMapper carteMapper;

	@Test
	public void split() {
		String origin = "D:\\upload\\testFile";
		String expected = "testFile";
		int index = origin.lastIndexOf("\\");
		assertEquals(expected, origin.substring(index + 1, origin.length()));
	};

	@Test
	public void convertImgPath() {
		CarteDetailInfo detailInfo = new CarteDetailInfo();
		detailInfo.setImgPath("D:\\upload\\testFile\\testFile");
		String expected = "view\\testFile";
		when(carteMapper.selectCarteDetailInfo(0)).thenReturn(detailInfo);

		CarteDetailInfo actual = service.getCarte(0);

		assertEquals(expected, actual.getImgPath());
	}
	
	@Test
	public void timeParsing() {
		int expected = 28;
		Calendar cal = Calendar.getInstance();
		cal.set(2017,2, 1);
		cal.add(Calendar.DAY_OF_MONTH, -1);
		assertEquals(expected, cal.get(Calendar.DAY_OF_MONTH));
	}
}
