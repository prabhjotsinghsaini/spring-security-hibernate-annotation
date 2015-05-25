package com.prasingh.dao;

import com.prasingh.model.User;




public interface UserDao {

	User findByUserName(String username);

}