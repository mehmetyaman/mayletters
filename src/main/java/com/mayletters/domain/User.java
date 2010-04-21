/**
 * 
 */
package com.mayletters.domain;

import java.util.ArrayList;
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
@Table (appliesTo = "users")
public class User extends BaseEntity {
	
	private static final long serialVersionUID = -6992730305266098196L;

	private String name;
	private String lastName;

	private String email;

	private Boolean active;

	private Address address;

	private List<Role> roles;

	@Override
	public String toString() {
		return this.name + " " + this.lastName;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof User) {
			User user = (User) o;
			return this.getId().equals(user.getId());
		}
		return false;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public List<String> validate() {
		List<String> errors = new ArrayList<String>();
		if (this.name == null || this.name.trim().equals("")) {
			errors.add("Ýsim bos olamaz");
		}
		if (this.lastName == null || this.lastName.trim().equals("")) {
			errors.add("Soyisim bos olamaz");
		}
		// Burada cok dilli destegi nasýl saðlarýz ??
		return errors;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
