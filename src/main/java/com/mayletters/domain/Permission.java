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
 * Tests
 */
@Entity
@Table (appliesTo="permissions")
public class Permission extends BaseEntity {

	private static final long serialVersionUID = -8049671310549713416L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long permissionId;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.may.mektup.model.BaseEntity#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		if (o instanceof Permission) {
			Permission permission = (Permission) o;
			return this.permissionId.equals(permission.getPermissionId());
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

	public Long getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(Long permissionId) {
		this.permissionId = permissionId;
	}

}
