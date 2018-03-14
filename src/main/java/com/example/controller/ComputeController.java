package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jin.D
 * @date: 2018年3月14日 下午6:39:45
 */

@RestController
@RequestMapping("/")
public class ComputeController {
	@RequestMapping("/")
	public String home() {
		return "Hello";
	}
}
