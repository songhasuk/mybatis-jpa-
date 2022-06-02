package com.nowon.shs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nowon.shs.domain.dto.MemberInsertDTO;
import com.nowon.shs.mybatis.mapper.MemberMapper;
import com.nowon.shs.service.MemberService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MemberServiceProc implements MemberService {
	
	@Autowired
	private MemberMapper mapper;
	
	@Override
	public void save(MemberInsertDTO dto) {
		//DBMS에 DTO에 저장된 데이터를 저장해주는 로직
		//★★DB접근(JPA[repository객체], MYBATIS[mapper객체]) 
		
		int result = mapper.save(dto);
		
		log.debug(result+"명의 회원가입 정상완료");
		
		
		
	}

}
