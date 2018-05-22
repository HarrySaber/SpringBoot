package com.example.controller;

import cn.starpost.event.rabbitmq.RabbitMQEventBus;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapper.UserMapper;
import com.example.model.User;
import org.springframework.web.servlet.ModelAndView;

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
    public ModelAndView home() {
        User user = userMapper.getById("1");
        //return user.toString();
        return new ModelAndView("index.html");
    }

    @RequestMapping("/redisHandler")
    public ModelAndView redisHandler() {
        System.out.println("asdfsd");
        stringRedisTemplate.opsForValue().set("k5", "Springboot redis");
        return new ModelAndView("login.html");
    }
}
