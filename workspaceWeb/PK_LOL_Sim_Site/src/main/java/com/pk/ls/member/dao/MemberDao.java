package com.pk.ls.member.dao;

import java.util.Map;

import com.pk.ls.member.vo.MemberVo;

public interface MemberDao {

	public int memberRegister(MemberVo memberVo);
	public MemberVo memberExist(Map<String, Object> paramMap);
	public MemberVo memberInfo(MemberVo memberVo);
	public int memberUpdate(MemberVo memberVo);
	public int memberDelete(int memberNumber);
}
