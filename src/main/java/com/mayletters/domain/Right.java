package com.mayletters.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "rights", schema = "mayletters")
public class Right extends AbsEntity {

	private static final long serialVersionUID = 7813177494642133423L;

	@Id
	@SequenceGenerator(name = "rights_gen", sequenceName = "rights_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rights_gen")
	public Long id;

	@ManyToOne(optional = false)
	@JoinColumn(name = "user_id" ,nullable=false, updatable = false)
	private User user;
	
	private com.mayletters.util.Right userRight;
	
	public void setUser(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setUserRight(com.mayletters.util.Right userRight) {
		this.userRight = userRight;
	}

	public com.mayletters.util.Right getUserRight() {
		return userRight;
	}

}
