package com.mayletters.service.dao;

import java.util.Date;
import java.util.List;

import com.mayletters.domain.User;

public interface IUserDAO {

	public abstract List<User> listByBirtDate(Date date);

	public abstract List<User> listByName(String name);

}
