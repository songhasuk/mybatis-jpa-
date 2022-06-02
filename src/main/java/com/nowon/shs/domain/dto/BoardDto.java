package com.nowon.shs.domain.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BoardDto {
	private int no;
	private String memo;
	private String writer;
	private String pass;
	private LocalDateTime createdDate;//created_date
	private LocalDateTime updatedDate;
	
}
