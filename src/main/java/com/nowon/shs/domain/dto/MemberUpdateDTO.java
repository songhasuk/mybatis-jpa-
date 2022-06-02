package com.nowon.shs.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class MemberUpdateDTO {

	
	private long no;

	private String pass;
}
