package com.mayletters.domain;

import java.util.List;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbsEntity extends AbsId {

	private static final long serialVersionUID = 7132001874756948837L;
	
	public List<String> validate(){
		return null;
	}


}
