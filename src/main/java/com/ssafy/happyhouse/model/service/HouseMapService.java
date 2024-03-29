package com.ssafy.happyhouse.model.service;

import java.util.List;

import com.ssafy.happyhouse.model.HouseInfoDto;
import com.ssafy.happyhouse.model.SidoGugunCodeDto;

public interface HouseMapService {

	List<SidoGugunCodeDto> getSido() throws Exception;
	List<SidoGugunCodeDto> getGugunInSido(String sido) throws Exception;
	List<HouseInfoDto> getDongInGugun(String gugun) throws Exception;
	List<HouseInfoDto> getAptInDong(String dong) throws Exception;
	List<HouseInfoDto> getAptList(String dong) throws Exception;
	List<HouseInfoDto> getAptListInfo(String aptlist) throws Exception;

	List<HouseInfoDto> getAptByText(String text) throws Exception;
	List<HouseInfoDto> getAptByAptCode(String aptCode) throws Exception;
	List<HouseInfoDto> getSearchBygugun(String gugun, String userid);
}