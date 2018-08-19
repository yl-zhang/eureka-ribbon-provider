package com.wheat.springcloud.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.wheat.springcloud.entity.User;

@Service
public class UserServiceImpl implements UserService{

	private static Map<Integer,User> map;
	
	static {
		map = new HashMap<>();
		for (int i=1; i<6; i++) {
			map.put(i, new User(i,"test" +i , "pwd" + i,8081));
		}
	}

	@Override
	public User getById(Integer id) {
		return map.get(id);
	}

}
