/**
 * 
 */
package com.mayletters.location;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

import com.mayletters.domain.AbsEntity;
import com.mayletters.domain.Address;
import com.mayletters.domain.User;

/**
 * @author aykutt
 *
 */
@Entity
@Table (appliesTo = "letters")
public class Letter extends AbsEntity {
	
	private static final long serialVersionUID = -2049382970256543286L;

	public static enum LETTER_STATE {
		CREATED, READY, SENT
		//When first created CREATED
		//When saved for postage READY
		//When sent SENT
	}
	
	//MAX ALLOWED PAGE NUMBER 	
	public static final int DEFAULT_NUMBER_OF_PAGES=3;
	
	
	//Will be persisted
	
	private Long letterId; 
	
	private LETTER_STATE letterState;
	
	private User user;
	
	
	//WILL NOT BE PERSISTED
	private List<String> pages;
	private Address envelopeAddress;
	
	public Letter(){
		this.letterState=LETTER_STATE.CREATED;
//		this.setDescription("");
	}
	
	/* (non-Javadoc)
	 * @see com.may.mektup.model.BaseEntity#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		if(o instanceof Letter){
			Letter letter=(Letter)o;
			return this.getLetterId().equals(letter.getLetterId());
		}
		return false;
	}

	public Long getLetterId() {
		return letterId;
	}

	public void setLetterId(Long letterId) {
		this.letterId = letterId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public List<String> validate() {
		List<String> errors=new ArrayList<String>();
		if(this.user==null){
			errors.add("Kullanýcý bilgisi yok");
		}
		if(this.envelopeAddress==null){
			errors.add("Zarf adresi bos olamaz.");
		}
		if(this.pages==null||this.pages.size()<1){
			errors.add("Sayfa olusturulmamýþ.");
		}
		
		//Burada cok dilli destegi nasýl saðlarýz ?? 
		return errors;
	}

	public LETTER_STATE getLetterState() {
		return letterState;
	}

	public void setLetterState(LETTER_STATE letterState) {
		this.letterState = letterState;
	}

	public List<String> getPages() {
		return pages;
	}

	public void setPages(List<String> pages) {
		this.pages = pages;
	}

	public void addPage(String page){
		this.pages.add(page);
	}

	public Address getEnvelopeAddress() {
		return envelopeAddress;
	}

	public void setEnvelopeAddress(Address envelopeAddress) {
		this.envelopeAddress = envelopeAddress;
	}
}
