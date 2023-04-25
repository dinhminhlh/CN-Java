package com.example.demo.modeldto;

import com.example.demo.entity.User;

public class UserMapping {
	public static UserDto toUserDto(User user) {
		UserDto tmp = new UserDto();
		tmp.setId(user.getId());
		tmp.setName(user.getName());
		tmp.setEmail(user.getEmail());
		tmp.setAvartar(user.getAvartar());
		tmp.setPhone(user.getPhone());
		
		return tmp;
	}
}
