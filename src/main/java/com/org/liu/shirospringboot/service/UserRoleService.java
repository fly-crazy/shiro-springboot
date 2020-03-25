package com.org.liu.shirospringboot.service;

import com.org.liu.shirospringboot.pojo.User;

public interface UserRoleService {

	public void setRoles(User user, long[] roleIds);

	public void deleteByUser(long userId);

	public void deleteByRole(long roleId);

}