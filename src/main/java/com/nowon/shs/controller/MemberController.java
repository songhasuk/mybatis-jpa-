package com.nowon.shs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nowon.shs.domain.dto.MemberInsertDTO;
import com.nowon.shs.service.MemberService;

import lombok.extern.slf4j.Slf4j;

@Slf4j  //로그 정보를 출력해주는 어노미테이션
@RequestMapping("/member") //중간 공통 주소부분을 생략하게 해주는 
@Controller  // ★컨트롤러 선언 
public class MemberController {	
	
	
	//로직처리(DB에 데이터 저장)하기 위한 서비스
	///service/MemberService.java(인터페이스의 구현 클래서에서 정의된 추상 메소드)에 IOS 컨테이너에 저장된 Bean 객체를 불러들인다.
	@Autowired
	private MemberService service;
	
	@PostMapping("signup")
	public String signup(MemberInsertDTO dto) {
		log.debug(">>>회원가입처리"+dto);
		
		//웹(view) → 서버(controller) 회원가이을 위한 데이터 전송
		//매핑메소드의 파라미터에 데이터 타입 정의하면 된다.
		//DB에 저장
		service.save(dto);
		return "redirect:/";
	}

}
