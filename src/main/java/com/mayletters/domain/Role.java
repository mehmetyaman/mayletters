/**
 * 
 */
package com.mayletters.domain;

import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author aykutt
 * 
 */
@Entity
@Table(name = "roles", schema = "mayletters")
public class Role extends AbsEntity {

	private static final long serialVersionUID = -5569459993422958824L;

	@Id
	@SequenceGenerator(name = "roles_gen", sequenceName = "roles_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "roles_gen")
	private Long id;

	@ManyToOne(optional = false)
	@JoinColumn(name = "user_id" ,nullable=false, updatable = false)
	private User user;
	
	@OneToMany(targetEntity=Right.class, cascade=CascadeType.ALL, mappedBy="role")
	private Collection<Right> rights;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.may.mektup.model.BaseEntity#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		if (o instanceof Role) {
			Role role = (Role) o;
			return this.getId().equals(role.getId());
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
		return null;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setRights(Collection<Right> rights) {
		this.rights = rights;
	}

	public Collection<Right> getRights() {
		return rights;
	}


}
