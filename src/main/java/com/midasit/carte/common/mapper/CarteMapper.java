package com.midasit.carte.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.midasit.carte.common.model.CarteDetailInfo;
import com.midasit.carte.common.model.CarteInfo;
import com.midasit.carte.common.model.CarteSearchParam;

@Mapper
public interface CarteMapper {
	public void insertCarteInfo(CarteInfo carte);

	public void updateCarteInfo(CarteInfo carte);

	public CarteDetailInfo selectCarteDetailInfo(long carteId);

	public List<CarteInfo> selectCarteInfoList(CarteSearchParam param);

	public void deleteCarteInfo(long carteId);
}
