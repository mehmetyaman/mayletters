/**
 * 
 */
package com.mayletters.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author aykutt
 * 
 */
public abstract class BaseEntity extends AbsId implements Serializable{

	private static final long serialVersionUID = 1754582405599653610L;
	
	private Date createDate; // update="false"
	private Date modifiedDate;
	private String description;

	public abstract boolean equals(Object o);

	public abstract List<String> validate();

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String toString() {
		return this.description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
