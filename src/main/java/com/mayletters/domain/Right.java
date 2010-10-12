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
	@JoinColumn(name = "role_id" ,nullable=false, updatable = false)
	private Role role;
	
	private String rightName;

	public Right(String rightName) {
		super();
		this.rightName = rightName;
	}

	public void setRightName(String rightName) {
		this.rightName = rightName;
	}

	public String getRightName() {
		return rightName;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Role getRole() {
		return role;
	}

}
