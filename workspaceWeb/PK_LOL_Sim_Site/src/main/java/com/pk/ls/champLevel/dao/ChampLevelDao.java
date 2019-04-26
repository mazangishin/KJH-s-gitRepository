package com.pk.ls.champLevel.dao;

import java.util.Map;

import com.pk.ls.champLevel.vo.ChampLevelVo;

public interface ChampLevelDao {

	public ChampLevelVo champLevelSelectOne(Map<String, Object> map);
	public int champLevelCreate(ChampLevelVo champLevelVo);
	public int champLevelUpdate(ChampLevelVo champLevelVo);
	
}
