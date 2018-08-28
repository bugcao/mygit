package com.example.demo1.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.POJO.JSONResult;
import com.example.demo1.POJO.Resource;

//@Controller   JsonUtil 
/**
* @Title: UserController
* @Description:
* @author caohaishan
* @date 2018年8月27日  
*/
@RestController
@RequestMapping("/hello")
public class UserController {
	
	@Autowired
	private Resource resource;
	
	@RequestMapping("/hello1")
	public Object hello1() {
		return "Hello SpringBoot!";
	}
	@RequestMapping("/getResource")
	public JSONResult getResource() {
		Resource bean = new Resource();
		BeanUtils.copyProperties(resource, bean);
		return JSONResult.ok(bean);
		
	}
}
