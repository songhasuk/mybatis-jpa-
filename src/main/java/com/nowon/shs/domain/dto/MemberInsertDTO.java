package com.nowon.shs.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor 	
@Builder // 값입력 해주는 빌더패턴 양식 제공
public class MemberInsertDTO {
	
	
	private String email;
	private String name;
	private String pass;

}
