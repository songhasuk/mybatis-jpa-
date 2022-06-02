package com.nowon.shs.mybatis.mapper;

import java.util.Optional;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.nowon.shs.domain.dto.MemberDTO;
import com.nowon.shs.domain.dto.MemberInsertDTO;
import com.nowon.shs.domain.dto.MemberUpdateDTO;


@Mapper
public interface MemberMapper {
	
	@Insert("insert into member(email, name, pass)" + "values(#{email}, #{name}, #{pass})")
	int save(MemberInsertDTO dto);
	
	@Update("update member" + "set pass = #{pass} where no =#{no}")
	int update(MemberUpdateDTO dto);

	@Select("select * from member where no = #{no}")
	Optional<MemberDTO> selectById(long no);

	
}
