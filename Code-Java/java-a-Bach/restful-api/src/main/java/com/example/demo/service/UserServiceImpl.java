package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.entity.User;
import com.example.demo.exception.NotFoundException;
import com.example.demo.modeldto.UserDto;
import com.example.demo.modeldto.UserMapping;

@Component
public class UserServiceImpl implements UserService{
	private static List<User> users = new ArrayList<User>();
	
	static {
		users.add(new User(1,"a","a@gmail.com","0311231325", "ava1.jpg", " 123"));
		users.add(new User(2,"b","b@gmail.com","0312123432", "ava2.jpg", " 234"));
		users.add(new User(3,"c","c@gmail.com","0311232422", "ava3.jpg", " 345"));
		users.add(new User(4,"d","d@gmail.com","0462343452", "ava4.jpg", " 456"));
		
	}

	@Override
	public List<UserDto> getListUser() {
		List<UserDto> result = new ArrayList<UserDto>();
		for(User user : users) {
			result.add(UserMapping.toUserDto(user));
		}
		return result;
	}

	@Override
	public UserDto getUserById(int id) {
		for(User user : users) {
			if(user.getId() == id) {
				return UserMapping.toUserDto(user);
			}
		}
		throw new NotFoundException("User khong ton tai");
	}

	@Override
	public List<UserDto> searchUser(String keyword) {
		List<UserDto> result = new ArrayList<UserDto>();
		for(User user : users) {
			if(user.getName().contains(keyword)) {
				result.add(UserMapping.toUserDto(user));
			}
		}
		return result;
	}
	
}
