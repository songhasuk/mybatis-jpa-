package com.nowon.shs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.nowon.shs.domain.dto.BoardDto;
import com.nowon.shs.domain.dto.MemberInsertDTO;

@Mapper
public interface BoardMapper {

	List<BoardDto> findAllDesc();
	//메서드 선언: sql은 xml 파일에서 적용
	
	@Select("SELECT * FROM board WHERE no = #{no}")
	BoardDto findByNo(@Param("no")int no);
	
	@Insert("insert into board(memo,writer,created_date) values(#{memo},#{writer},now())")
	void save(MemberInsertDTO memberInsertDTO);
}