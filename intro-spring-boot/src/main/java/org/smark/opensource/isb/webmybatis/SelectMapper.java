package org.smark.opensource.isb.webmybatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SelectMapper {
	
	@Select("select 1 + 2 as a")
	public int test();
}
