package com.prasingh.users.dao;

import com.prasingh.users.model.User;

public interface UserDao {

	User findByUserName(String username);

}