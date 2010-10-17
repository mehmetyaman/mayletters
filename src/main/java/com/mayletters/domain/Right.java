package com.mayletters.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rights", schema = "mayletters")
public class Right {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long id;
	
	private int rightId;

	public Right(int rightId) {
		this.rightId = rightId;
	}

	public void setRightId(int rightId) {
		this.rightId = rightId;
	}

	public int getRightId() {
		return rightId;
	}

}
