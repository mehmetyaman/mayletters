package com.mayletters.util;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "rights", schema = "mayletters")
public enum Right {

	WRITE_CARD, WRITE_MAIL, ADMIN

}
