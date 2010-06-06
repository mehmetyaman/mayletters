package com.mayletters.service.dao;

import com.mayletters.domain.User;

import java.util.Date;
import java.util.List;

public class UserDao extends BaseDAO implements IUserDAO {

	private static final long serialVersionUID = -5964987834998249018L;

	public UserDao() {
		targetEntity = User.class;
	}

	@Override
	public Class<?> getTargetEntityClass() {
		return targetEntity;
	}

	@SuppressWarnings("unchecked")
	public List<User> listByBirtDate(Date date) {
		return (List<User>) appManager.createQuery(
				"SELECT p FROM User p WHERE p.birthDate = :ident")
				.setParameter("ident", date).getResultList();

	}

	@SuppressWarnings("unchecked")
	public List<User> listByName(String name) {

		return (List<User>) appManager.createQuery(
				"SELECT p FROM User p WHERE p.name = :ident").setParameter(
				"ident", name).getResultList();

	}

	@SuppressWarnings("unchecked")
	public List<User> listByUserName(String userName) {

		return (List<User>) appManager.createQuery(
				"SELECT p FROM User p WHERE p.userName = :ident").setParameter(
				"ident", userName).getResultList();

	}

}
