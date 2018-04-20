package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapper.UserMapper;
import com.example.model.User;

/**
 * @author Jin.D
 * @date: 2018年3月14日 下午6:39:45
 */

@RestController
@RequestMapping("/")
public class ComputeController {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;


	@Autowired
	private UserMapper userMapper;

	@RequestMapping("/")
	public String home() {
		User user = userMapper.getById("1");
		return user.toString();
	}

	@RequestMapping("/redisHandler")
	public String redisHandler(){
		stringRedisTemplate.opsForValue().set("k5", "Springboot redis");
		return stringRedisTemplate.opsForValue().get("k5");
	}
}
