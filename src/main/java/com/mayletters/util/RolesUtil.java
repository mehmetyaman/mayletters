package com.mayletters.util;

import java.util.ArrayList;
import java.util.List;

import com.mayletters.domain.Role;

public class RolesUtil {

	public static Role getGuestRole() {
		Role role = new Role();
		List<Right> rights = new ArrayList<Right>();
		rights.add(Right.WRITE_CARD);
		rights.add(Right.WRITE_MAIL);
		role.setRights(rights);
		return role;
	}

}
