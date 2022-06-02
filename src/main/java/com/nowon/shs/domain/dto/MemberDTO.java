package com.nowon.shs.domain.dto;

import java.time.LocalDateTime;

import lombok.Data;

//db select한 결과를 가져와 매핑하는 클래스로 사용되기 때문에
//해당 테이블의 모든 속성들을 필드로 정의해줘야된다.
@Data
public class MemberDTO {
	

	private long no;
	private String email;
	private String name;
	private String pass;
	
	LocalDateTime createdDate;
	LocalDateTime updatedDate;

}
