/**
 * 
 */
package com.mayletters.domain;

import java.util.List;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

/**
 * @author aykutt
 * 
 */
@Entity
@Table (appliesTo = "addresses")
public class Address extends BaseEntity {

	private static final long serialVersionUID = 1345475383444998054L;

	public static enum ADDRESS_TYPE {
		CITY_STATE_COUNTRY, FREE
	}

	public Address() {
		this.addressType = ADDRESS_TYPE.FREE;
		this.addressLine1 = "";
		this.addressLine2 = "";
	}

	private ADDRESS_TYPE addressType;

	// Gönderici adres bilgilerini alacagýz
	// Serbest format adres sistemi temeli
	private String addressLine1;
	private String addressLine2;
	private String zipCode;

	// Kodlamalalý adres sistemi icin ilaveler
	private String city;
	// Her yerde yok alan olsun ama ekranda sormayacagýz
	private String state;
	private String country;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.may.mektup.model.BaseEntity#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		// if(o )
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

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public ADDRESS_TYPE getAddressType() {
		return addressType;
	}

	public void setAddressType(ADDRESS_TYPE addressType) {
		this.addressType = addressType;
	}

}
