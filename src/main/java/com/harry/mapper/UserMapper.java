package com.harry.mapper;
/** 
* @author  Jin.D 
* @date: 2018年3月15日 上午10:02:39 
*/

import org.apache.ibatis.annotations.Mapper;

import com.harry.model.User;

@Mapper
public interface UserMapper {
	User getById(String id);
	
}
