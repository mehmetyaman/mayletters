package com.mayletters.service.dao;

import com.mayletters.domain.User;

public class RightDao extends BaseDAO {

	private static final long serialVersionUID = -5964987834998249018L;

	public RightDao() {
		targetEntity = User.class;
	}

	@Override
	public Class<?> getTargetEntityClass() {
		return targetEntity;
	}


}
