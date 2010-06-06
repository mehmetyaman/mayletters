/**
 * 
 */
package com.mayletters.domain;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;



/**
 * @author aykutt
 * 
 */
@Entity
@Table ( appliesTo= "roles")
public class Role extends AbsEntity {

	private static final long serialVersionUID = -5569459993422958824L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long roleId;

	private List<Permission> permissions;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.may.mektup.model.BaseEntity#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		if (o instanceof Role) {
			Role role = (Role) o;
			return this.getRoleId().equals(role.getRoleId());
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.may.mektup.model.BaseEntity#validate()
	 */
	@Override
	public List<String> validate() {
		// TODO Auto-generated method stub
		return null;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public List<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

}
