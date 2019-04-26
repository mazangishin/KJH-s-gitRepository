package com.pk.ls.champLevel.service;

import java.util.Map;

import com.pk.ls.champLevel.vo.ChampLevelVo;

public interface ChampLevelService {

	public ChampLevelVo champLevelSelectOne(Map<String, Object> map);
	public void champLevelCreate(ChampLevelVo champLevelVo);
	public int champLevelUpdate(ChampLevelVo champLevelVo);
	
}
