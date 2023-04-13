package com.ds.groupware.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ds.groupware.dto.HobbyDto;

@Repository("hobbyDao")
public class HobbyDaoImpl implements HobbyDao{
	@Autowired
	SqlSessionTemplate sm;

	@Override
	public List<HobbyDto> getList(HobbyDto dto) {
		return sm.selectList("Hobby_getList",dto);
	}

	@Override
	public int getTotalCnt(HobbyDto dto) {
		return sm.selectOne("Hobby_getTotalCnt",dto);
	}
}
