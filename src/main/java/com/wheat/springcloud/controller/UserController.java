package com.wheat.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wheat.springcloud.entity.User;
import com.wheat.springcloud.service.UserService;

@RestController
@RequestMapping("/provider/user")
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("/get/{id}")
	public User get(@PathVariable("id") Integer id) {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return this.userService.getById(id);
	}
}
