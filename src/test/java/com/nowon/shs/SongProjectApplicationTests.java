package com.nowon.shs;

import java.lang.reflect.Member;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jayway.jsonpath.Option;
import com.nowon.shs.domain.dto.BoardDto;
import com.nowon.shs.domain.dto.MemberDTO;
import com.nowon.shs.domain.dto.MemberInsertDTO;
import com.nowon.shs.domain.dto.MemberUpdateDTO;
import com.nowon.shs.mapper.BoardMapper;
import com.nowon.shs.mybatis.mapper.MemberMapper;

@SpringBootTest
class SongProjectApplicationTests {

	/*
	 * @Autowired private BoardMapper mapper; //@Test void contextLoads() {
	 * 
	 * List<BoardDto> result=mapper.findAllDesc(); for(BoardDto dto:result) {
	 * System.out.println(dto); }
	 * 
	 * mapper.findAllDesc().forEach(System.out::println);
	 * 
	 * }
	 * 
	 * //@Test void 단일데이터읽기() { BoardDto dto=mapper.findByNo(1);
	 * System.out.println(dto); }
	 * 
	 * //@Test void 데이터입력() { //mapper.save(BoardDto.builder() //
	 * .memo("메모에요").writer("작성자") // .build()); }
	 */
	@Autowired
	MemberMapper mapper1;

	//@Test
	void 멤버삽입테스트() {
		int i = mapper1.save(MemberInsertDTO.builder()
				.email("shs2@naver.com").name("song").pass("111")
				.build());
		
		System.out.println(i+"명 가입함");
	}
	 @Test
	 void 비밀번호수정() {
		 
		 MemberUpdateDTO dto =  MemberUpdateDTO.builder()
				 				.no(1).pass("2222").build();  //바꿔줄 데이터를 우선 객체에 초기화 해줘서 저장
		 //먼저 대상이 존재하는지를 체크
		 Optional<MemberDTO> result = mapper1.selectById(dto.getNo());
		 //MemberUpdateDTO에 저장된 회원번호를 가져와서, 그 회원의 전체 정보(튜블) 데이터 가져오기
		 
		 if(result.isEmpty()) {
		 System.out.println("존재하지 않는 회원입니다.");
		 	}
		 MemberDTO des =  result.get();  //.get() 하면 저장된 모든 필드의 값이 넘어가진다.
		 System.out.println(des);
		 
		 mapper1.update(dto);
	}
	
	

}